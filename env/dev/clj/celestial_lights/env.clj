(ns celestial-lights.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [celestial-lights.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[celestial-lights started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[celestial-lights has shut down successfully]=-"))
   :middleware wrap-dev})
