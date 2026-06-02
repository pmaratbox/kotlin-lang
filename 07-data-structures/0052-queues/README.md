# 0052 — Queues

Enqueue `1`, `2`, and `3` into a queue, then dequeue them all and print them in first-in-first-out order: `1 2 3`. Kotlin's stdlib `ArrayDeque` (`kotlin.collections.ArrayDeque`) is a growable deque: `addLast` enqueues and `removeFirst()` dequeues from the front.

## Run

    kotlinc Queues.kt -include-runtime -d queues.jar && java -jar queues.jar
