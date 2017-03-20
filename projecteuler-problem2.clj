;; By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
;; find the sum of the even-valued terms.

(defn fib
    "Return a seq of Fibonacci numbers, with a maximum of 4,000,000"
    [x y fib-nums]
    (if (or (empty? fib-nums) (<= (+ x y) 4000000))
        (let [new-fib-num (+ x y)]
            (recur y new-fib-num (conj fib-nums new-fib-num))
        )
        fib-nums))

(defn take-even [x]
    (if (even? x)
        x
        0))

(defn get-even-fibs []
    (let [fibs (concat [1 2] (fib 1 2 []))]
        (map take-even fibs)))

;; To solve:
(reduce + (get-even-fibs))

;; =========================================
;; Alternatively, we could also do this:
(defn take-even-2 [x]
    (if (even? x)
        x
        nil))

(defn get-even-fibs-2 []
    (let [fibs (concat [1 2] (fib2 1 2 []))]
        (reduce + (keep take-even-2 fibs))))
;; This makes use of 'keep', which I just discovered and is pretty fuckin' nifty

;; To solve:
(get-even-fibs-2)
