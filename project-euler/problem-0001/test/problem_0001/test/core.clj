(ns problem-0001.test.core
  (:use [problem-0001.core])
  (:use [clojure.test]))

(deftest test-is-multiple-of-5
    (is (= true (is-multiple 5 5))))
    
(deftest test-is-not-multiple-of-5
    (is (= false (is-multiple 4 5))))

(deftest test-sum-of-numbers-below-10-that-are-multiples-of-3-or-5
    (is (= 23 (sum-of-all-the-multiples-of-3-or-5-below 10))))

(deftest test-sum-of-numbers-below-10-that-are-multiples-of-3-or-5
    (is (= 233168 (sum-of-all-the-multiples-of-3-or-5-below 1000))))
