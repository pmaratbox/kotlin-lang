# 0382 — Fork-Join Sum

Recursively fork the sum of [1..8] into halves and join the partial sums, printing `36`. Kotlin uses Java's `RecursiveTask` on the `ForkJoinPool`, forking the left half and joining its result after computing the right.

## Run

    kotlinc ForkJoinSum.kt -include-runtime -d forkjoinsum.jar && java -jar forkjoinsum.jar
