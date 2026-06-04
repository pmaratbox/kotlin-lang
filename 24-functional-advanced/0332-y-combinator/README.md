# 0332 — Y Combinator

Define factorial via a fixed-point combinator (no named self-recursion) and compute 5!, printing `120`. A `Rec` wrapper lets the self-application type-check in Kotlin.

## Run

    kotlinc YCombinator.kt -include-runtime -d ycombinator.jar && java -jar ycombinator.jar
