# 0245 — Modular Exponentiation

Compute 3^13 mod 7 by fast modular exponentiation, printing `3`. Bitwise `and`/`shr` drive the square-and-multiply loop.

## Run

    kotlinc ModularExponentiation.kt -include-runtime -d modularexponentiation.jar && java -jar modularexponentiation.jar
