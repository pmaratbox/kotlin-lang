# 0410 — Merge Streams

Implement merge of two timed streams using a virtual-time scheduler, interleaving them by emission time. Kotlin's `PriorityQueue` with a `compareBy` comparator keeps ties stable via an insertion sequence.

## Run

    kotlinc MergeStreams.kt -include-runtime -d mergestreams.jar && java -jar mergestreams.jar
