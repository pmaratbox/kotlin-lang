# 0244 — Extended Euclid

Compute extended gcd(30,12) returning g and Bezout coefficients, printing `6 1 -2` (since 30*1+12*(-2)=6). A `Triple` carries the gcd and both coefficients out of the recursion.

## Run

    kotlinc GcdExtended.kt -include-runtime -d gcdextended.jar && java -jar gcdextended.jar
