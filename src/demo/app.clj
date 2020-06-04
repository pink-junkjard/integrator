(ns demo.app
  (:require
   [integrator.core])
  (:gen-class))

(defn -main []
  (println "starting..")
  (r.base/init!)
  (r.math/sin 3.14)
  (println "done!"))
