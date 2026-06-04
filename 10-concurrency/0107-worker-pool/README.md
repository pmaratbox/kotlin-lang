# 0107 — Worker Pool

Distribute squaring of 1..4 across a pool of workers, collect the results, and print them sorted ascending `1 4 9 16`. Kotlin submits tasks to a fixed `ExecutorService`, gathers each `Future`, and `sorted()` makes the output deterministic.

## Run

    kotlinc Pool.kt -include-runtime -d pool.jar && java -jar pool.jar
