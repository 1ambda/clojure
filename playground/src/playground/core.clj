(ns playground.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(foo "Hoon")

(println (class (/ 1 3)))

; clojure.lang.ratio
(println (< 1 2 4 3))

(println 1)
(println (str 1))

(println (str "yoda, " "luke, " "darth"))
(println (str "one : " 1 ", two: " 2))
(println (str \f \o \r \c \e))

; false
(println (= "a" \a))

(println (class "a")) ; java.lang.Character
(println (class \a))  ; java.lang.String

;; list
(list 1 2 3)
'(1 2 3)

(first '(:r2d2 :c3po))
(last '(:r2d2 :c3po))
(rest '(:r2d2 :c3po))
(cons :battle-droid '(:r2d2 :c3po))

;; vector
[:hutt :wokie :ewok]

;; 코드를 담을때는 리스트를 이용하고, 데이터를 담을때는 벡터를 이용하라.
;; 벡터는 비순차적 접근에 최적화 되어있다.

(println (nth [:a :b :c] 0))
(println (rest [:a :b :c]))

;; 벡터도 함수
(println ([:a :b :c] 2))


