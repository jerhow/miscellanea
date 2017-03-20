(defn fizzbuzz
  "If x is a multiple of three, print x along with 'Fizz';
   if x is a multiple of five, print x along with 'Buzz';
   if x is a multiple of both three and five, print x and shout 'FIZZBUZZ!!!'"
    [x]
    (if (and (zero? (mod x 3)) (zero? (mod x 5)))
        (str x " FIZZBUZZ!!!")
        (if (zero? (mod x 3))
            (str x " Fizz")
            (if (zero? (mod x 5))
                (str x " Buzz")
                x))))

;; Fizzbuzz for a seq of integers, 1 to 100:
(def nums (range 1 101))
(map fizzbuzz nums)
;; Result:
;; (1 2 "3 Fizz" 4 "5 Buzz" "6 Fizz" 7 8 "9 Fizz" "10 Buzz" 11 "12 Fizz" 13 14 "15 FIZZBUZZ!!!" 16 17 "18 Fizz" 19 "20 Buzz" "21 Fizz" 22 23 "24 Fizz" "25 Buzz" 26 "27 Fizz" 28 29 "30 FIZZBUZZ!!!" 31 32 "33 Fizz" 34 "35 Buzz" "36 Fizz" 37 38 "39 Fizz" "40 Buzz" 41 "42 Fizz" 43 44 "45 FIZZBUZZ!!!" 46 47 "48 Fizz" 49 "50 Buzz" "51 Fizz" 52 53 "54 Fizz" "55 Buzz" 56 "57 Fizz" 58 59 "60 FIZZBUZZ!!!" 61 62 "63 Fizz" 64 "65 Buzz" "66 Fizz" 67 68 "69 Fizz" "70 Buzz" 71 "72 Fizz" 73 74 "75 FIZZBUZZ!!!" 76 77 "78 Fizz" 79 "80 Buzz" "81 Fizz" 82 83 "84 Fizz" "85 Buzz" 86 "87 Fizz" 88 89 "90 FIZZBUZZ!!!" 91 92 "93 Fizz" 94 "95 Buzz" "96 Fizz" 97 98 "99 Fizz" "100 Buzz")
