# 0412 — Combine Latest

Implement combineLatest of two timed streams, emitting the pair of latest values whenever either source emits (once both have emitted). A `PriorityQueue` with a `compareBy` comparator gives a deterministic virtual-time scheduler.

## Run

    kotlinc CombineLatest.kt -include-runtime -d combinelatest.jar && java -jar combinelatest.jar
