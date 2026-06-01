# 0043 — Function Composition

Compose `inc` (add one) and `twice` (multiply by two) into one function and apply it to `3`, so `inc(twice(3))` prints `7`. `compose` takes two `(Int) -> Int` function values and returns a lambda `{ x -> f(g(x)) }`. Kotlin function types are first-class, so functions can be stored, passed, and returned like any value.

## Run

    kotlinc FunctionComposition.kt -include-runtime -d compose.jar && java -jar compose.jar
