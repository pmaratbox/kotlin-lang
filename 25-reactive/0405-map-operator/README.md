# 0405 — Map Operator

Implement a map operator that transforms each emitted value, applying x => x*2 to a stream of 1, 2, 3, 4. The operator wraps the source's `Observer` so each `next` forwards `f(value)` downstream.

## Run

    kotlinc MapOperator.kt -include-runtime -d mapoperator.jar && java -jar mapoperator.jar
