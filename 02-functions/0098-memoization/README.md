# 0098 — Memoization

Compute `fibonacci(10)` recursively with memoization (caching each result so it is computed once) and print it: `55`. A `HashMap` caches results; `cache[n]?.let { return it }` returns early when the value is already present.

## Run

    kotlinc Memoization.kt -include-runtime -d memo.jar && java -jar memo.jar
