# 0040 — Generators & Lazy Sequences

Produce an endless lazy sequence of squares and take only the first three, printing `1 4 9`. The `sequence { ... }` builder with `yield` produces a lazy `Sequence`; values are computed on demand, so `take(3)` evaluates only the first three squares of the infinite loop.

## Run

    kotlinc Generators.kt -include-runtime -d gen.jar && java -jar gen.jar
