(ns portkey.aws.sms.-2016-10-24 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sms", :region "ap-northeast-1"},
    :ssl-common-name "sms.ap-northeast-1.amazonaws.com",
    :endpoint "https://sms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sms", :region "eu-west-1"},
    :ssl-common-name "sms.eu-west-1.amazonaws.com",
    :endpoint "https://sms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sms", :region "us-east-2"},
    :ssl-common-name "sms.us-east-2.amazonaws.com",
    :endpoint "https://sms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sms", :region "ap-southeast-2"},
    :ssl-common-name "sms.ap-southeast-2.amazonaws.com",
    :endpoint "https://sms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sms", :region "ap-northeast-2"},
    :ssl-common-name "sms.ap-northeast-2.amazonaws.com",
    :endpoint "https://sms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sms", :region "eu-central-1"},
    :ssl-common-name "sms.eu-central-1.amazonaws.com",
    :endpoint "https://sms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sms", :region "us-gov-west-1"},
    :ssl-common-name "sms.us-gov-west-1.amazonaws.com",
    :endpoint "https://sms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sms", :region "us-west-2"},
    :ssl-common-name "sms.us-west-2.amazonaws.com",
    :endpoint "https://sms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sms", :region "us-east-1"},
    :ssl-common-name "sms.us-east-1.amazonaws.com",
    :endpoint "https://sms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sms", :region "ap-south-1"},
    :ssl-common-name "sms.ap-south-1.amazonaws.com",
    :endpoint "https://sms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
