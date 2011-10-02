(ns problem-0002.test.core
  (:use [problem-0002.core])
  (:use [clojure.test]))

(deftest fibonacci-seq-unitl-2 []
  (is (= (quote (1 2)) (fibonacci-seq-until 2))))

(deftest fibonacci-seq-unitl-10 []
  (is (= (quote (1 2 3 5 8)) (fibonacci-seq-until 10))))

(deftest fibonacci-seq-unitl-90 []
  (is (= (quote (1 2 3 5 8 13 21 34 55 89)) (fibonacci-seq-until 90))))

(deftest problem-solution []
    (is (= 4613732 (reduce + (filter even? (fibonacci-seq-until 4000000))))))
