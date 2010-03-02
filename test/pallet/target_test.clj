(ns pallet.target-test
  (:use [pallet.target] :reload-all)
  (:use [pallet.target :only [with-target-template]]
        clojure.test
        pallet.test-utils))

(deftest with-target-template-test
  (with-target-template [:ubuntu]
    (is (= [:ubuntu] *target-template*))))

(deftest with-target-tag-test
  (with-target-tag :ubuntu
    (is (= :ubuntu *target-tag*))))
