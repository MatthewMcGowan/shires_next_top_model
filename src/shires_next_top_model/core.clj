(ns shires-next-top-model.core
  (:use shires-next-top-model.hobbit-hitter
        shires-next-top-model.asym-body-hobbit-parts)
  (:gen-class))

(defn -main
  [& args]
  (hit asym-body-hobbit-parts))