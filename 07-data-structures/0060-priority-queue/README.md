# 0060 — Priority Queue

Push `3`, `1`, and `2` into a min-priority-queue, then pop them all and print them in priority (ascending) order: `1 2 3`. Kotlin uses Java's `PriorityQueue`, a binary min-heap by natural ordering; `add` enqueues and `poll()` removes the minimum.

## Run

    kotlinc PriorityQueueDemo.kt -include-runtime -d priorityqueue.jar && java -jar priorityqueue.jar
