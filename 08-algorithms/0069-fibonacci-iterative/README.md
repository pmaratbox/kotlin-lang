# 0069 — Fibonacci (Iterative)

Print the first seven Fibonacci numbers, computed iteratively (each the sum of the previous two): `0 1 1 2 3 5 8`. `repeat(7) { ... }` runs the body seven times; a temporary `t` carries the next term.

## Run

    kotlinc Fibonacci.kt -include-runtime -d fibonacci.jar && java -jar fibonacci.jar
