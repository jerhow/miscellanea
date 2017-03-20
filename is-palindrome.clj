(defn is-palindrome?
    "Returns true if word is a palindrome, else false"
    [word]
    (if (= (first word) (last word))
        (if (<= (count word) 2)
            true
            (recur (subs (subs word 0 (- (count word) 1)) 1)))
        false))
