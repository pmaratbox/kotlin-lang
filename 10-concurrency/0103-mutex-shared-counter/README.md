# 0103 — Mutex-Protected Counter

Have multiple threads each increment a shared counter under a mutex so the total is exactly `1000`. Kotlin's `synchronized(lock) { ... }` block guards the critical section so increments don't race.

## Run

    kotlinc SharedCounter.kt -include-runtime -d sharedcounter.jar && java -jar sharedcounter.jar
