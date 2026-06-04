# 0110 — Currying

Curry a two-argument add into a chain of one-argument functions and call it as `add(2)(3)`, printing `5`. In Kotlin, `add` returns a lambda that captures the first argument.

## Run

    kotlinc Currying.kt -include-runtime -d currying.jar && java -jar currying.jar
