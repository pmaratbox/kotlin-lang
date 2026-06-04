# 0358 — Adjacent Pairs

Produce the consecutive pairs of [1,2,3,4], printing `1,2 2,3 3,4`. Kotlin's `windowed(2)` yields each sliding window of consecutive elements.

## Run

    kotlinc AdjacentPairs.kt -include-runtime -d adjacentpairs.jar && java -jar adjacentpairs.jar
