# 0102 — Threads Returning Values

Run two threads that compute the squares of 3 and 4, join them, and print the sum of their results `25`. Kotlin uses `ExecutorService.submit` which returns a `Future<T>` whose `get()` blocks for the computed value.

## Run

    kotlinc ReturnValues.kt -include-runtime -d returnvalues.jar && java -jar returnvalues.jar
