(ns problem-0001.core)

(defn is-multiple [x y]
    (= 0 (mod x y)))

(defn sum-of-all-the-multiples-of-3-or-5-below [x]
    (reduce + (filter #(or (is-multiple % 3) (is-multiple % 5)) (range 1 x))))
