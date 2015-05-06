(ns macros.core
  (:gen-class))

;; sintax-quote `()
;; unquote ~
;; unquote-splice ~@
(defmacro unless
    [condition & body]
    `(if (not ~condition)
        (do ~@body)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (unless (even? 3) "Now we see it ...")))
