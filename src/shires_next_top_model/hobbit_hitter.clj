(ns shires-next-top-model.hobbit-hitter
  (:use shires-next-top-model.symmetrise-body-parts))

(defn hit
  [body-parts]
  (let [body-part-size-sum (reduce + (map :size body-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] body-parts
           accumulated-size (:size part)]
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))