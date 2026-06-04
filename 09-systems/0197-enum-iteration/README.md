# 0197 — Enum Iteration

Iterate over all values of a Color enum (RED, GREEN, BLUE) and print their names `RED GREEN BLUE`. Kotlin exposes the constants in declaration order via the `entries` property on the enum class.

## Run

    kotlinc Iteration.kt -include-runtime -d iteration.jar && java -jar iteration.jar
