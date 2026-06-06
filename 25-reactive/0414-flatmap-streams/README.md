# 0414 — FlatMap (mergeMap)

Implement flatMap/mergeMap: map each outer value to an inner timed stream and merge all inners concurrently (no cancellation). A single shared virtual-time `Scheduler` backed by `java.util.PriorityQueue` keeps every inner subscription's events interleaved deterministically.

## Run

    kotlinc FlatmapStreams.kt -include-runtime -d flatmapstreams.jar && java -jar flatmapstreams.jar
