(ns shires-next-top-model.core
  (:use shires-next-top-model.asym-body-hobbit-parts
        shires-next-top-model.symmetrise-body-parts)
  (:gen-class))

(defn -main
  [& args]
  (better-symmetrise-body-parts asym-body-hobbit-parts))