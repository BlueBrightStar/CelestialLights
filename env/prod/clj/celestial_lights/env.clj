(ns celestial-lights.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[celestial-lights started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[celestial-lights has shut down successfully]=-"))
   :middleware identity})
