# 0401 — Create an Observable

Build a push-based Observable from scratch that emits 1, 2, 3 to its observer and then completes. Kotlin models the observer as a small class holding `next`/`complete` lambdas, and the producer as a function literal passed to the `Observable` constructor.

## Run

    kotlinc ObservableCreate.kt -include-runtime -d observablecreate.jar && java -jar observablecreate.jar
