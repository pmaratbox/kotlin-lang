# 0003 — Arithmetic & operators

Compute and print the five elementary arithmetic operations on two integers
(`a = 17`, `b = 5`). Kotlin's `/` between two `Int`s truncates toward zero,
same as Java. Use `a.toDouble() / b` for the fractional quotient. String
templates need braces `${...}` when the embedded value is an expression
(rather than a simple `$identifier`).

## Run

    kotlinc Arithmetic.kt -include-runtime -d arithmetic.jar && java -jar arithmetic.jar
