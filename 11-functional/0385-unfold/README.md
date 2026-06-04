# 0385 — Unfold

Unfold a sequence by doubling from 1, taking five terms, printing `1 2 4 8 16`. Kotlin's `generateSequence` unfolds lazily from a seed with a next function.

## Run

    kotlinc Unfold.kt -include-runtime -d unfold.jar && java -jar unfold.jar
