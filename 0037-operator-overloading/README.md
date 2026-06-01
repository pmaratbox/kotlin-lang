# 0037 — Operator Overloading

Define how `+` (or an `add` method) combines two points, then add `(1, 2)` and `(3, 4)` and print `(4, 6)`. Marking a function `operator fun plus` lets `+` call it; Kotlin recognizes a fixed set of operator names (`plus`, `minus`, `times`, `get`, ...). The `data class` supplies fields, `toString`, and equality.

## Run

    kotlinc OperatorOverloading.kt -include-runtime -d operators.jar && java -jar operators.jar
