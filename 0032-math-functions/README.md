# 0032 — Math Functions

Take the square root of `16`, raise `2` to the 10th power, the absolute value of `-5`, and the larger of `3` and `9`, printing `sqrt: 4`, `pow: 1024`, `abs: 5`, and `max: 9`. The `kotlin.math` package provides `sqrt` and the `Double.pow` extension (both floating-point, hence `.toInt()`), plus an integer `abs` overload that needs no cast; `maxOf` is a top-level comparison function. `sqrt`/`pow` delegate to `java.lang.Math`, while `maxOf` is pure Kotlin.

## Run

    kotlinc MathFunctions.kt -include-runtime -d math.jar && java -jar math.jar
