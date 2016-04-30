(ns shires-next-top-model.symmetrise-body-parts)

(defn matching-part
  [part]
  { :name (clojure.string/replace (:name part) #"^left" "right-")
   :size (:size part)})

(defn symmetrise-body-parts
  [asym-body-parts]
  (loop [remaining-asym-body-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaining-asym-body-parts)
      (final-body-parts)
      (let [[part & remaining] remaining-asym-body-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))

(defn better-symmetrise-body-parts
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts
                  (set [part (matching-part part)])))
          []
          asym-body-parts))