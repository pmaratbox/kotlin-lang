# 0329 — CPS Factorial

Compute 5! in continuation-passing style, printing `120`. Each recursive call threads a continuation lambda, with the identity as the final one.

## Run

    kotlinc CpsFactorial.kt -include-runtime -d cpsfactorial.jar && java -jar cpsfactorial.jar
