# 0135 — Clamp a Value

Clamp 15 and -3 into the range [0, 10], printing `10 0`. Kotlin's `maxOf`/`minOf` from the standard library compose into a one-line `clamp`.

## Run

    kotlinc Clamp.kt -include-runtime -d clamp.jar && java -jar clamp.jar
