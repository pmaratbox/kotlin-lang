# 0250 — Iterative Fast Power

Compute 2^10 by iterative binary exponentiation, printing `1024`. Bitwise `and`/`shr` inspect each exponent bit while squaring the base.

## Run

    kotlinc FastPowerIterative.kt -include-runtime -d fastpoweriterative.jar && java -jar fastpoweriterative.jar
