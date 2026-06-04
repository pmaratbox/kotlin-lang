# 0104 — Atomic Counter

Increment a shared atomic counter from multiple threads 1000 times total without a lock, printing `1000`. Kotlin reuses Java's `AtomicInteger`, whose `incrementAndGet()` is a lock-free atomic operation.

## Run

    kotlinc Counter.kt -include-runtime -d counter.jar && java -jar counter.jar
