(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [clojure.string :as str]
    [clojure.java.io :as io]
    [clj-http.client :as http]
    [cheshire.core :as json]
    [aws-sig4.auth :as auth]
    [aws-sig4.middleware :as auth-mw]
    [clojure.spec.alpha :as spec]))

(def ^:dynamic *region* nil)
(def ^:dynamic *credentials*
  "A map with keys :access-key, :secret-key and optionally :token"
  nil)

(defmacro cond
  ([] nil)
  ([c e & etc]
    (case c
      :let `(let ~e (cond ~@etc))
      :when-let `(when-let ~e (cond ~@etc))
      :when-some `(when-some ~e (cond ~@etc))
      (case (and (vector? c) (some #{:let :some} (keys (meta c))))
        :let `(if-let ~(vary-meta c dissoc :let) ~e (cond ~@etc))
        :some `(if-some ~(vary-meta c dissoc :some) ~e (cond ~@etc))
        `(if ~c ~e (cond ~@etc))))))

(defn- parse-profile [file profile]
  (when (.exists file)
    (with-open [rdr (io/reader file)]
      (into {}
        (comp
          (remove #(re-matches #"\s*(?:;.*)?" %))
          (map str/trim)
          (drop-while #(not= profile (second (re-matches #"\[\s*(.+?)\s*]" %))))
          (drop 1)
          (map #(when-some [[_ k v] (re-matches #"([^\[=][^=]*)=(.*)" %)] [k v]))
          (take-while some?))
        (->> rdr java.io.BufferedReader. line-seq)))))

(defn- guess-credentials!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (when-some [[a s]
              (cond
               ^:some [id (System/getenv "AWS_ACCESS_KEY_ID")]
               [id (System/getenv "AWS_SECRET_ACCESS_KEY")]

               ^:some [id (System/getProperty "aws.accessKeyId")]
               [id (System/getProperty "aws.secretKey")]

               :let [file (or (some-> (System/getenv "AWS_CREDENTIAL_PROFILES_FILE") java.io.File.)
                            (java.io.File. (System/getProperty "user.home") ".aws/credentials"))
                     profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")
                     {:strs [aws_access_key_id aws_secret_access_key]}
                     (parse-profile file profile)]
               (some? aws_access_key_id)
               [aws_access_key_id aws_secret_access_key]
    
               #_(TODO
                   curl "169.254.170.2$AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"
                   {
                    "AccessKeyId" "ACCESS_KEY_ID",
                    "Expiration" "EXPIRATION_DATE",
                    "RoleArn" "TASK_ROLE_ARN",
                    "SecretAccessKey" "SECRET_ACCESS_KEY",
                    "Token" "SECURITY_TOKEN_STRING"
                    }))]
    {:access-key a :secret-key s}))

(defn- guess-region!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (or
    (System/getenv "AWS_REGION")
    (let [file (or (some-> (System/getenv "AWS_CONFIG_FILE") java.io.File.)
                 (java.io.File. (System/getProperty "user.home") ".aws/config"))
          profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")]
      (get (parse-profile file profile) "region"))
    #_(TODO see "http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html")
    "us-east-1"))

(defn credentials []
  (or *credentials* (guess-credentials!)
    (throw (RuntimeException. "No AWS credentials found!"))))

(defn region []
  (or *region* (guess-region!)))

(def ^:private ensure-aws-date (auth-mw/wrap-aws-date identity))

(defn- sign-v4 [req credential-scope]
  (let [{:keys [token] :as aws-opts} (into (credentials) credential-scope)
        req (ensure-aws-date req)
        auth (-> req
               auth/canonical-request
               (auth/string-to-sign aws-opts)
               (auth/authorization aws-opts)
               :authorization)]
    (-> req
      (assoc-in [:headers "Authorization"] auth)
      (cond-> token (assoc-in [:headers "X-Amz-Security-Token"] token)))))

(defn wrap-sign [client]
  (fn [{:as req :keys [::credential-scope ::signature-version]}]
    (let [req (dissoc req ::credential-scope ::signature-version)
          req (case signature-version
                :v4 (sign-v4 req credential-scope))]
      (client req))))

(defn sync-http-client [req coerce-resp]
  (http/with-additional-middleware [wrap-sign]
    (let [[tag v] (-> req
                    (assoc :throw-exceptions false)
                    http/request
                    coerce-resp)]
      (case tag
        :result v
        :exception (throw v)))))

(def ^:dynamic *http-client* sync-http-client)

; Java 8
(defn base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))
(defn base64-decode [^String s] (.decode (java.util.Base64/getDecoder) s))

(defn- params-to-header [{:as req :keys [body headers]} param-to-headers]
  (-> req
    (assoc :headers (reduce-kv (fn [headers param [header jsonvalue]]
                                 (if-some [v (get body param)]
                                   (assoc headers header 
                                     (cond-> v
                                       jsonvalue (-> json/generate-string base64-encode)))
                                   headers))
                      headers param-to-headers))
           (assoc :body (reduce dissoc body (keys param-to-headers)))))

(defn- params-to-uri [{:as req :keys [body url]} uri-to-param]
  (-> req
    (assoc :url (str/replace url #"\{(.*)}" (fn [[_ name]]
                                              (if-some [v (get body (uri-to-param name))]
                                                (http/url-encode-illegal-characters v)
                                                (throw (ex-info (str "Missing parameter " name)
                                                         {:url url :url-to-param uri-to-param :input body}))))))
    (assoc :body (reduce dissoc body (vals uri-to-param)))))

(defn- params-to-querystring [{:as req :keys [body url]} querystring-to-param]
  (-> req
    (assoc :url 
      (apply str url "?"
        (keep (fn [[qs name]]
                (when-some [v (get body name)]
                  (str (http/url-encode-illegal-characters qs) "=" (http/url-encode-illegal-characters v))))
          querystring-to-param)))
    (assoc :body (reduce dissoc body (vals querystring-to-param)))))

(defn- params-to-payload [{:as req :keys [body]} param]
  (if param
    (assoc req :body (get body param))
    req))

(defn conform-or-throw [spec x]
  (let [x' (spec/conform spec x)]
    (if (spec/invalid? x')
      (throw (ex-info (spec/explain-str spec x) {:spec spec :x x}))
      x')))

(defn -rest-json-call [endpoints method uri input input-spec
                       {headers-params :headers uri-params :uri querystring-params :querystring payload :payload}
                       ok-code output-spec error-specs]
  (let [{:keys [endpoint credential-scope signature-version]} (endpoints (region))]
    (->
      {:method method
       ::credential-scope credential-scope
       ::signature-version signature-version
       :url (str endpoint uri)
       :headers {"content-type" "application/json"}
       :as :json-string-keys
       :body (some-> input-spec (conform-or-throw input))}
      (params-to-header headers-params)
      (params-to-uri uri-params)
      (params-to-querystring querystring-params)
      (params-to-payload payload)
      (update :body #(some-> % json/generate-string))
      (*http-client*
        (fn [response]
          (if (= ok-code (:status response))
            [:result (if output-spec
                       (spec/unform output-spec (:body response))
                       true)]
            [:exception
             (if-some [[type spec] (find error-specs (get-in response [:headers "x-amzn-ErrorType"]))]
               (let [m (spec/unform spec (json/parse-string (:body response)))]
                 (ex-info (str type ": " (:message m)) m))
               (ex-info "Unexpected response" {:response response}))]))))))

;; spec utils
(defn keep-keys [f]
  #(into {} (keep (fn [[k v]] (when-some [k (f k)] [k v]))) %))

(defn dashed [^String s]
  (-> s (.replaceAll "(?<=[a-z0-9])(?=[A-Z]([a-z]|$))|_" "-") .toLowerCase))

(defn- dash-keys [e]
  (cond
    (vector? e)
    (into [] (map dash-keys) e)
    (sequential? e)
    (map dash-keys e)
    (keyword? e)
    (keyword (namespace e) (dashed (name e)))
    :else e))

(defmacro json-keys [& {:keys [req-un opt-un]}]
  (let [to-string (into {} (comp (mapcat flatten) (map (fn [k] [(keyword (dashed (name k))) (name k)]))) [req-un opt-un])
        to-keys (into {} (map (fn [[k v]] [v k])) to-string)]
    `(spec/and
       (spec/keys :req-un ~(dash-keys req-un) :opt-un ~(dash-keys opt-un))
       (spec/conformer (keep-keys ~to-string) (keep-keys ~to-keys)))))