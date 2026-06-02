# 0068 — GCD (Euclid)

Compute the greatest common divisor of `48` and `36` with Euclid's algorithm (repeatedly replace the pair with `(b, a % b)` until the remainder is zero) and print it: `12`. Parameters are read-only, so local `var`s `x`/`y` carry the loop state until `y` reaches zero.

## Run

    kotlinc Gcd.kt -include-runtime -d gcd.jar && java -jar gcd.jar
