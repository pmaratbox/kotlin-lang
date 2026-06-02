# 0014 — Higher-Order Functions

Write `apply(f, x)` that calls the function `f` on `x`, then pass it two
different functions, `inc` and `double`. Kotlin has first-class function types
written `(Int) -> Int`, and lambdas like `{ x: Int -> x + 1 }` create the
values.

## Run

    kotlinc HigherOrder.kt -include-runtime -d hof.jar && java -jar hof.jar
