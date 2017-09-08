(ns portkey.aws.lex-models.-2017-04-19 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bot-metadata/name :portkey.aws.lex-models.-2017-04-19.bot-metadata/description :portkey.aws.lex-models.-2017-04-19.bot-metadata/status :portkey.aws.lex-models.-2017-04-19.bot-metadata/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.bot-metadata/createdDate :portkey.aws.lex-models.-2017-04-19.bot-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bots-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bots-response/bots :portkey.aws.lex-models.-2017-04-19.get-bots-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/slot :max-count 100))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/name :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/description :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/botVersion :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/botName :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/createdDate :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/name :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/botVersion :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/botName] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/description :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/locale-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/locale :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-slot-type-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-reference/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-reference/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/resource-reference (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.resource-reference/name :portkey.aws.lex-models.-2017-04-19.resource-reference/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/lambdaarn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 20 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2048)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA-Z0-9-_]+(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(:[a-zA-Z0-9-_]+)?" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/bot-aliases (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/BotAliases :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.prompt/messages (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.prompt/max-attempts (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt-max-attempts))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.prompt/response-card (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/prompt (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.prompt/messages :portkey.aws.lex-models.-2017-04-19.prompt/maxAttempts] :opt-un [:portkey.aws.lex-models.-2017-04-19.prompt/responseCard]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/sessionttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-response/intents :portkey.aws.lex-models.-2017-04-19.put-bot-response/createdDate :portkey.aws.lex-models.-2017-04-19.put-bot-response/idleSessionTTLInSeconds :portkey.aws.lex-models.-2017-04-19.put-bot-response/clarificationPrompt :portkey.aws.lex-models.-2017-04-19.put-bot-response/name :portkey.aws.lex-models.-2017-04-19.put-bot-response/locale :portkey.aws.lex-models.-2017-04-19.put-bot-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.put-bot-response/status :portkey.aws.lex-models.-2017-04-19.put-bot-response/abortStatement :portkey.aws.lex-models.-2017-04-19.put-bot-response/version :portkey.aws.lex-models.-2017-04-19.put-bot-response/failureReason :portkey.aws.lex-models.-2017-04-19.put-bot-response/childDirected :portkey.aws.lex-models.-2017-04-19.put-bot-response/checksum :portkey.aws.lex-models.-2017-04-19.put-bot-response/voiceId :portkey.aws.lex-models.-2017-04-19.put-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/description :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/botAlias :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/botName :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/createdDate :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/type :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/botConfiguration]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/channel-configuration-map (clojure.spec.alpha/map-of :portkey.aws.lex-models.-2017-04-19/string :portkey.aws.lex-models.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/name :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/description :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/botVersion :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/botName :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/createdDate :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bots-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bots-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-bots-request/maxResults :portkey.aws.lex-models.-2017-04-19.get-bots-request/nameContains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/locale (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"en-US" "en-US", :en-us "en-US"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/utterance-string (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/utterance-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/count (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/distinct-users (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/first-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/last-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.utterance-data/utteranceString :portkey.aws.lex-models.-2017-04-19.utterance-data/count :portkey.aws.lex-models.-2017-04-19.utterance-data/distinctUsers :portkey.aws.lex-models.-2017-04-19.utterance-data/firstUtteredDate :portkey.aws.lex-models.-2017-04-19.utterance-data/lastUtteredDate]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/alias-name-or-list-all (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^(-|^[a-zA-Z]+((_[a-zA-Z]+)*|([a-zA-Z]+_)*))$" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name-or-list-all))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/botName :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/botAlias] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/maxResults :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/nameContains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/sessionttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/process-behavior (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/process-behavior))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-bot-request/name :portkey.aws.lex-models.-2017-04-19.put-bot-request/locale :portkey.aws.lex-models.-2017-04-19.put-bot-request/childDirected] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-request/intents :portkey.aws.lex-models.-2017-04-19.put-bot-request/idleSessionTTLInSeconds :portkey.aws.lex-models.-2017-04-19.put-bot-request/clarificationPrompt :portkey.aws.lex-models.-2017-04-19.put-bot-request/processBehavior :portkey.aws.lex-models.-2017-04-19.put-bot-request/abortStatement :portkey.aws.lex-models.-2017-04-19.put-bot-request/checksum :portkey.aws.lex-models.-2017-04-19.put-bot-request/voiceId :portkey.aws.lex-models.-2017-04-19.put-bot-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/prompt-max-attempts (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-bot-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.create-bot-version-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-bot-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/numerical-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[0-9]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-list/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-list/utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/list-of-utterance))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance-list (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.utterance-list/botVersion :portkey.aws.lex-models.-2017-04-19.utterance-list/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/lists-of-utterances))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-utterances-view-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/botName :portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/name :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/description :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/enumerationValues :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/createdDate :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/version :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-intent-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/name :portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/slotTypes :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.statement/messages (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.statement/response-card (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/statement (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.statement/messages] :opt-un [:portkey.aws.lex-models.-2017-04-19.statement/responseCard]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 2 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-slot-type-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-slot-type-request/description :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/enumerationValues :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-intent-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.create-intent-version-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-intent-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/reference-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/reference-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/example-reference (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-reference))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/referenceType :portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/exampleReference]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.code-hook/uri (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/lambdaarn))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.code-hook/message-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/message-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/code-hook (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.code-hook/uri :portkey.aws.lex-models.-2017-04-19.code-hook/messageVersion] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z]+((_[a-zA-Z]+)*|([a-zA-Z]+_)*|_)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/retryAfterSeconds :portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance :max-count 10))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-types-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/maxResults :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/nameContains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/response-card (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/locale :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/signatureContains :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/name :portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/botName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"BUILDING" "BUILDING", :building "BUILDING", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED", "NOT_BUILT" "NOT_BUILT", :not-built "NOT_BUILT"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/priority (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 0 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/status-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"Detected" "Detected", :detected "Detected", "Missed" "Missed", :missed "Missed"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-slot-type-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/name :portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/name :portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-versions (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/version :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"PlainText" "PlainText", :plain-text "PlainText", "SSML" "SSML", :ssml "SSML"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/sessionttl (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 60 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 86400))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/content-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.follow-up-prompt/prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.follow-up-prompt/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/follow-up-prompt (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.follow-up-prompt/prompt :portkey.aws.lex-models.-2017-04-19.follow-up-prompt/rejectionStatement] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/botName :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/botAlias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-intent-slot/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.builtin-intent-slot/name]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/sessionttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-bot-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-bot-version-response/intents :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/createdDate :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/idleSessionTTLInSeconds :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/clarificationPrompt :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/name :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/locale :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/status :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/abortStatement :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/version :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/failureReason :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/childDirected :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/checksum :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/voiceId :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intents-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intents-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-intents-request/maxResults :portkey.aws.lex-models.-2017-04-19.get-intents-request/nameContains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/slotTypes :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/intents :portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/sessionttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-response/intents :portkey.aws.lex-models.-2017-04-19.get-bot-response/createdDate :portkey.aws.lex-models.-2017-04-19.get-bot-response/idleSessionTTLInSeconds :portkey.aws.lex-models.-2017-04-19.get-bot-response/clarificationPrompt :portkey.aws.lex-models.-2017-04-19.get-bot-response/name :portkey.aws.lex-models.-2017-04-19.get-bot-response/locale :portkey.aws.lex-models.-2017-04-19.get-bot-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.get-bot-response/status :portkey.aws.lex-models.-2017-04-19.get-bot-response/abortStatement :portkey.aws.lex-models.-2017-04-19.get-bot-response/version :portkey.aws.lex-models.-2017-04-19.get-bot-response/failureReason :portkey.aws.lex-models.-2017-04-19.get-bot-response/childDirected :portkey.aws.lex-models.-2017-04-19.get-bot-response/checksum :portkey.aws.lex-models.-2017-04-19.get-bot-response/voiceId :portkey.aws.lex-models.-2017-04-19.get-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/locale :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/signatureContains :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/intent :max-count 100))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/fulfillment-activity-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"ReturnIntent" "ReturnIntent", :return-intent "ReturnIntent", "CodeHook" "CodeHook", :code-hook "CodeHook"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-channel-association-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/bot-channel-association :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intents-response/intents :portkey.aws.lex-models.-2017-04-19.get-intents-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/list-of-utterance (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance-data :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 0 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-slot-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-slot-type-response/name :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/description :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/enumerationValues :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/createdDate :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/version :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/bot-channel-associations (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-association-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/botChannelAssociations :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.message/content-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/content-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.message/content (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/content-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/message (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.message/contentType :portkey.aws.lex-models.-2017-04-19.message/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-request/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intent-request/signature] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z]+((_[a-zA-Z]+)*|([a-zA-Z]+_)*|_)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-utterances-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-utterances-request/user-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/user-id))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-utterances-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-utterances-request/botName :portkey.aws.lex-models.-2017-04-19.delete-utterances-request/userId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/custom-or-builtin-slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^([a-zA-Z]|AMAZON.)+((_[a-zA-Z]+)*|([a-zA-Z]+_)*|_)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/enumeration-values (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/enumeration-value :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 2 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 50)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z]+((_[a-zA-Z]+)*|([a-zA-Z]+_)*|_)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/priority (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/priority))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/response-card (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/slot-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/custom-or-builtin-slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/slot-constraint (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-constraint))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/slot-type-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/value-elicitation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.slot/name :portkey.aws.lex-models.-2017-04-19.slot/slotConstraint] :opt-un [:portkey.aws.lex-models.-2017-04-19.slot/priority :portkey.aws.lex-models.-2017-04-19.slot/responseCard :portkey.aws.lex-models.-2017-04-19.slot/slotType :portkey.aws.lex-models.-2017-04-19.slot/slotTypeVersion :portkey.aws.lex-models.-2017-04-19.slot/sampleUtterances :portkey.aws.lex-models.-2017-04-19.slot/valueElicitationPrompt :portkey.aws.lex-models.-2017-04-19.slot/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z]+(((_|.)[a-zA-Z]+)*|([a-zA-Z]+(_|.))*|(_|.))" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-intent-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-intent-response/followUpPrompt :portkey.aws.lex-models.-2017-04-19.put-intent-response/fulfillmentActivity :portkey.aws.lex-models.-2017-04-19.put-intent-response/slots :portkey.aws.lex-models.-2017-04-19.put-intent-response/parentIntentSignature :portkey.aws.lex-models.-2017-04-19.put-intent-response/confirmationPrompt :portkey.aws.lex-models.-2017-04-19.put-intent-response/createdDate :portkey.aws.lex-models.-2017-04-19.put-intent-response/name :portkey.aws.lex-models.-2017-04-19.put-intent-response/rejectionStatement :portkey.aws.lex-models.-2017-04-19.put-intent-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.put-intent-response/dialogCodeHook :portkey.aws.lex-models.-2017-04-19.put-intent-response/conclusionStatement :portkey.aws.lex-models.-2017-04-19.put-intent-response/sampleUtterances :portkey.aws.lex-models.-2017-04-19.put-intent-response/version :portkey.aws.lex-models.-2017-04-19.put-intent-response/checksum :portkey.aws.lex-models.-2017-04-19.put-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-channel-association-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/name :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/botName :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/botAlias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.fulfillment-activity/type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.fulfillment-activity/code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/fulfillment-activity (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.fulfillment-activity/type] :opt-un [:portkey.aws.lex-models.-2017-04-19.fulfillment-activity/codeHook]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/message-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/message :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-intent-request/name :portkey.aws.lex-models.-2017-04-19.get-intent-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intent-response/followUpPrompt :portkey.aws.lex-models.-2017-04-19.get-intent-response/fulfillmentActivity :portkey.aws.lex-models.-2017-04-19.get-intent-response/slots :portkey.aws.lex-models.-2017-04-19.get-intent-response/parentIntentSignature :portkey.aws.lex-models.-2017-04-19.get-intent-response/confirmationPrompt :portkey.aws.lex-models.-2017-04-19.get-intent-response/createdDate :portkey.aws.lex-models.-2017-04-19.get-intent-response/name :portkey.aws.lex-models.-2017-04-19.get-intent-response/rejectionStatement :portkey.aws.lex-models.-2017-04-19.get-intent-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.get-intent-response/dialogCodeHook :portkey.aws.lex-models.-2017-04-19.get-intent-response/conclusionStatement :portkey.aws.lex-models.-2017-04-19.get-intent-response/sampleUtterances :portkey.aws.lex-models.-2017-04-19.get-intent-response/version :portkey.aws.lex-models.-2017-04-19.get-intent-response/checksum :portkey.aws.lex-models.-2017-04-19.get-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.intent-metadata/name :portkey.aws.lex-models.-2017-04-19.intent-metadata/description :portkey.aws.lex-models.-2017-04-19.intent-metadata/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.intent-metadata/createdDate :portkey.aws.lex-models.-2017-04-19.intent-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-constraint (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"Required" "Required", :required "Required", "Optional" "Optional", :optional "Optional"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.slot-type-metadata/name :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/description :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/createdDate :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/intent-metadata :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/message-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/slot-type-metadata :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-intent-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-intent-request/followUpPrompt :portkey.aws.lex-models.-2017-04-19.put-intent-request/fulfillmentActivity :portkey.aws.lex-models.-2017-04-19.put-intent-request/slots :portkey.aws.lex-models.-2017-04-19.put-intent-request/parentIntentSignature :portkey.aws.lex-models.-2017-04-19.put-intent-request/confirmationPrompt :portkey.aws.lex-models.-2017-04-19.put-intent-request/rejectionStatement :portkey.aws.lex-models.-2017-04-19.put-intent-request/dialogCodeHook :portkey.aws.lex-models.-2017-04-19.put-intent-request/conclusionStatement :portkey.aws.lex-models.-2017-04-19.put-intent-request/sampleUtterances :portkey.aws.lex-models.-2017-04-19.put-intent-request/checksum :portkey.aws.lex-models.-2017-04-19.put-intent-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/reference-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"Intent" "Intent", :intent "Intent", "Bot" "Bot", :bot "Bot", "BotAlias" "BotAlias", :bot-alias "BotAlias", "BotChannel" "BotChannel", :bot-channel "BotChannel"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"\$LATEST|[0-9]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/signature :portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/supportedLocales]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance :max-count 1500))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/signature :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/supportedLocales :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/slots]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-request/name :portkey.aws.lex-models.-2017-04-19.get-slot-type-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.enumeration-value/value (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/value))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/enumeration-value (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.enumeration-value/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z]+((_[a-zA-Z]+)*|([a-zA-Z]+_)*|_)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/name :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/description :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/botVersion :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/botName :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/createdDate :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-response/name :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/description :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/enumerationValues :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/createdDate :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/version :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/bots :portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-request/version-or-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-request/name :portkey.aws.lex-models.-2017-04-19.get-bot-request/versionOrAlias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/botName] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/nextToken :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/maxResults :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/nameContains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/bot-metadata :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-channel-association (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bot-channel-association/name :portkey.aws.lex-models.-2017-04-19.bot-channel-association/description :portkey.aws.lex-models.-2017-04-19.bot-channel-association/botAlias :portkey.aws.lex-models.-2017-04-19.bot-channel-association/botName :portkey.aws.lex-models.-2017-04-19.bot-channel-association/createdDate :portkey.aws.lex-models.-2017-04-19.bot-channel-association/type :portkey.aws.lex-models.-2017-04-19.bot-channel-association/botConfiguration]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 100)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z]+((_[a-zA-Z]+)*|([a-zA-Z]+_)*|_)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/signature :portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/supportedLocales]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/name :portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/botName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/process-behavior (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"SAVE" "SAVE", :save "SAVE", "BUILD" "BUILD", :build "BUILD"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/intents :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-types-response/slotTypes :portkey.aws.lex-models.-2017-04-19.get-slot-types-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/lists-of-utterances (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance-list :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent/intent-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent/intent-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.intent/intentName :portkey.aws.lex-models.-2017-04-19.intent/intentVersion] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-intent-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-intent-version-response/followUpPrompt :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/fulfillmentActivity :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/slots :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/parentIntentSignature :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/confirmationPrompt :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/createdDate :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/name :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/rejectionStatement :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/lastUpdatedDate :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/dialogCodeHook :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/conclusionStatement :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/sampleUtterances :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/version :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/checksum :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/channel-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"Facebook" "Facebook", :facebook "Facebook", "Slack" "Slack", :slack "Slack", "Twilio-Sms" "Twilio-Sms", :twilio-sms "Twilio-Sms"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/bot-versions (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-versions))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/status-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-utterances-view-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/botName :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/botVersions :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/statusType] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/boolean clojure.core/boolean?)

(clojure.core/defn delete-bot-channel-association ([delete-bot-channel-association-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/bots/{botName}/aliases/{aliasName}/channels/{name}" delete-bot-channel-association-request :portkey.aws.lex-models.-2017-04-19/delete-bot-channel-association-request {:payload nil, :headers {}, :uri {"name" "name", "botName" "botName", "aliasName" "botAlias"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef delete-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-channel-association-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-slot-types ([] (get-builtin-slot-types {})) ([get-builtin-slot-types-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/builtins/slottypes/" get-builtin-slot-types-request :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-request {:payload nil, :headers {}, :uri {}, :querystring {"locale" "locale", "signatureContains" "signatureContains", "nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-response {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-response))

(clojure.core/defn get-bot-channel-associations ([get-bot-channel-associations-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{botName}/aliases/{aliasName}/channels/" get-bot-channel-associations-request :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-request {:payload nil, :headers {}, :uri {"botName" "botName", "aliasName" "botAlias"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-response {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-channel-associations :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-response))

(clojure.core/defn create-slot-type-version ([create-slot-type-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "POST" "/slottypes/{name}/versions" create-slot-type-version-request :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-response))

(clojure.core/defn get-slot-type ([get-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/slottypes/{name}/versions/{version}" get-slot-type-request :portkey.aws.lex-models.-2017-04-19/get-slot-type-request {:payload nil, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/get-slot-type-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-slot-type-response))

(clojure.core/defn get-intent-versions ([get-intent-versions-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/intents/{name}/versions/" get-intent-versions-request :portkey.aws.lex-models.-2017-04-19/get-intent-versions-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models.-2017-04-19/get-intent-versions-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-intent-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-intent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-intent-versions-response))

(clojure.core/defn get-utterances-view ([get-utterances-view-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{botname}/utterances?view=aggregation" get-utterances-view-request :portkey.aws.lex-models.-2017-04-19/get-utterances-view-request {:payload nil, :headers {}, :uri {"botname" "botName"}, :querystring {"bot_versions" "botVersions", "status_type" "statusType"}} 200 :portkey.aws.lex-models.-2017-04-19/get-utterances-view-response {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-utterances-view :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-utterances-view-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-utterances-view-response))

(clojure.core/defn delete-intent-version ([delete-intent-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/intents/{name}/versions/{version}" delete-intent-version-request :portkey.aws.lex-models.-2017-04-19/delete-intent-version-request {:payload nil, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-intent-version-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-intents ([] (get-builtin-intents {})) ([get-builtin-intents-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/builtins/intents/" get-builtin-intents-request :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-request {:payload nil, :headers {}, :uri {}, :querystring {"locale" "locale", "signatureContains" "signatureContains", "nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-response {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-response))

(clojure.core/defn get-slot-types ([] (get-slot-types {})) ([get-slot-types-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/slottypes/" get-slot-types-request :portkey.aws.lex-models.-2017-04-19/get-slot-types-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models.-2017-04-19/get-slot-types-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-slot-types-response))

(clojure.core/defn get-bot-alias ([get-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{botName}/aliases/{name}" get-bot-alias-request :portkey.aws.lex-models.-2017-04-19/get-bot-alias-request {:payload nil, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/get-bot-alias-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-alias-response))

(clojure.core/defn get-builtin-intent ([get-builtin-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/builtins/intents/{signature}" get-builtin-intent-request :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-request {:payload nil, :headers {}, :uri {"signature" "signature"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-response))

(clojure.core/defn delete-slot-type ([delete-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/slottypes/{name}" delete-slot-type-request :portkey.aws.lex-models.-2017-04-19/delete-slot-type-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-slot-type-request) :ret clojure.core/true?)

(clojure.core/defn create-bot-version ([create-bot-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "POST" "/bots/{name}/versions" create-bot-version-request :portkey.aws.lex-models.-2017-04-19/create-bot-version-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.lex-models.-2017-04-19/create-bot-version-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/create-bot-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/create-bot-version-response))

(clojure.core/defn put-intent ([put-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "PUT" "/intents/{name}/versions/$LATEST" put-intent-request :portkey.aws.lex-models.-2017-04-19/put-intent-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/put-intent-response {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-intent-response))

(clojure.core/defn delete-intent ([delete-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/intents/{name}" delete-intent-request :portkey.aws.lex-models.-2017-04-19/delete-intent-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-intent-request) :ret clojure.core/true?)

(clojure.core/defn get-intents ([] (get-intents {})) ([get-intents-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/intents/" get-intents-request :portkey.aws.lex-models.-2017-04-19/get-intents-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models.-2017-04-19/get-intents-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-intents-response))

(clojure.core/defn delete-utterances ([delete-utterances-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/bots/{botName}/utterances/{userId}" delete-utterances-request :portkey.aws.lex-models.-2017-04-19/delete-utterances-request {:payload nil, :headers {}, :uri {"botName" "botName", "userId" "userId"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef delete-utterances :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-utterances-request) :ret clojure.core/true?)

(clojure.core/defn get-intent ([get-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/intents/{name}/versions/{version}" get-intent-request :portkey.aws.lex-models.-2017-04-19/get-intent-request {:payload nil, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/get-intent-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-intent-response))

(clojure.core/defn create-intent-version ([create-intent-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "POST" "/intents/{name}/versions" create-intent-version-request :portkey.aws.lex-models.-2017-04-19/create-intent-version-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.lex-models.-2017-04-19/create-intent-version-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/create-intent-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/create-intent-version-response))

(clojure.core/defn get-bot-channel-association ([get-bot-channel-association-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{botName}/aliases/{aliasName}/channels/{name}" get-bot-channel-association-request :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-request {:payload nil, :headers {}, :uri {"name" "name", "botName" "botName", "aliasName" "botAlias"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-response))

(clojure.core/defn put-slot-type ([put-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "PUT" "/slottypes/{name}/versions/$LATEST" put-slot-type-request :portkey.aws.lex-models.-2017-04-19/put-slot-type-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/put-slot-type-response {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-slot-type-response))

(clojure.core/defn get-slot-type-versions ([get-slot-type-versions-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/slottypes/{name}/versions/" get-slot-type-versions-request :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-type-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-response))

(clojure.core/defn delete-bot-version ([delete-bot-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/bots/{name}/versions/{version}" delete-bot-version-request :portkey.aws.lex-models.-2017-04-19/delete-bot-version-request {:payload nil, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-version-request) :ret clojure.core/true?)

(clojure.core/defn get-bot-aliases ([get-bot-aliases-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{botName}/aliases/" get-bot-aliases-request :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-request {:payload nil, :headers {}, :uri {"botName" "botName"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-response {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-response))

(clojure.core/defn get-bot-versions ([get-bot-versions-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{name}/versions/" get-bot-versions-request :portkey.aws.lex-models.-2017-04-19/get-bot-versions-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models.-2017-04-19/get-bot-versions-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-versions-response))

(clojure.core/defn put-bot-alias ([put-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "PUT" "/bots/{botName}/aliases/{name}" put-bot-alias-request :portkey.aws.lex-models.-2017-04-19/put-bot-alias-request {:payload nil, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/put-bot-alias-response {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-bot-alias-response))

(clojure.core/defn get-bots ([] (get-bots {})) ([get-bots-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/" get-bots-request :portkey.aws.lex-models.-2017-04-19/get-bots-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models.-2017-04-19/get-bots-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bots :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-bots-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bots-response))

(clojure.core/defn get-bot ([get-bot-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "GET" "/bots/{name}/versions/{versionoralias}" get-bot-request :portkey.aws.lex-models.-2017-04-19/get-bot-request {:payload nil, :headers {}, :uri {"name" "name", "versionoralias" "versionOrAlias"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/get-bot-response {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-response))

(clojure.core/defn delete-slot-type-version ([delete-slot-type-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/slottypes/{name}/version/{version}" delete-slot-type-version-request :portkey.aws.lex-models.-2017-04-19/delete-slot-type-version-request {:payload nil, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-slot-type-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-bot ([delete-bot-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/bots/{name}" delete-bot-request :portkey.aws.lex-models.-2017-04-19/delete-bot-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-request) :ret clojure.core/true?)

(clojure.core/defn put-bot ([put-bot-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "PUT" "/bots/{name}/versions/$LATEST" put-bot-request :portkey.aws.lex-models.-2017-04-19/put-bot-request {:payload nil, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.lex-models.-2017-04-19/put-bot-response {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-bot-response))

(clojure.core/defn delete-bot-alias ([delete-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.lex-models.-2017-04-19/endpoints "DELETE" "/bots/{botName}/aliases/{name}" delete-bot-alias-request :portkey.aws.lex-models.-2017-04-19/delete-bot-alias-request {:payload nil, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-alias-request) :ret clojure.core/true?)
