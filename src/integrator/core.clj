(ns integrator.core)

(defn init! []
  (println "initializating R.."))

(defn sin [x]
  (println "calculating sin of " x))

(create-ns 'r.base)
(create-ns 'r.math)

(in-ns 'r.base)
(def init! integrator.core/init!)


(in-ns 'r.math)
(def sin integrator.core/sin)

