# 0005 — Loops

Print 1..5 with a for-loop over an inclusive range. Kotlin's `1..5` is
**inclusive** (creates an `IntRange`); use `1 until 5` for half-open and
`5 downTo 1` to count downward. There is no C-style three-part for-loop —
all `for` is iterator-based.

## Run

    kotlinc Loops.kt -include-runtime -d loops.jar && java -jar loops.jar
