# 0363 — Circular Queue

In a capacity-3 circular queue enqueue 1,2,3, dequeue once, enqueue 4, then print the contents `2 3 4`. A fixed IntArray with a head index and size wraps positions modulo the capacity.

## Run

    kotlinc CircularQueue.kt -include-runtime -d circularqueue.jar && java -jar circularqueue.jar
