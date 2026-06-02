# 0022 — Concurrency

Start two tasks that produce `1` and `2`, let them run concurrently, then join their results and print `sum: 3`. Kotlin's flagship concurrency model is coroutines, but those live in the separate `kotlinx.coroutines` library; with only the standard library this uses `kotlin.concurrent.thread`, which starts a JVM thread. `join()` waits, and the results land in a shared `IntArray`.

## Run

    kotlinc Concurrency.kt -include-runtime -d concurrency.jar && java -jar concurrency.jar
