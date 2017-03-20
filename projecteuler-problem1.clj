;; ====================
;; A stand-alone version for the REPL
(reduce (fn [x y]
    (if (or (zero? (mod y 3)) (zero? (mod y 5)))
        (+ x y)
        x)) 0 (range 1 1000))

;; ====================
;; A shorter version
(defn shorter-version
    [x y]
    (if (or (zero? (mod y 3)) (zero? (mod y 5)))
        (+ x y)
        x))

(reduce shorter-version 0 (range 1 1000))

;; ====================
;; My original version. Correct, but verbose.

;; Find the sum of all the multiples of 3 or 5 below 1000
(defn multiple-of-3-or-5? 
    "If num is a multiple of 3 or 5, return true, 
    else return false"
    [num]
    (or (zero? (mod num 3)) (zero? (mod num 5))))

(defn add-if-multiple
    "If y is a multiple of 3 or 5, returns the sum of x and y,
     otherwise returns x"
    [x y]
    (if (multiple-of-3-or-5? y)
        (+ x y)
        x))

(reduce add-if-multiple 0 (range 1 1000))
