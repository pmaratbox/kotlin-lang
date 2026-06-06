# 0413 — Zip Streams

Implement zip that pairs values by index and combines them; zip [1,2,3] with [10,20,30] using a+b. Per-source `ArrayDeque` buffers drain in lockstep whenever both hold a value.

## Run

    kotlinc ZipStreams.kt -include-runtime -d zipstreams.jar && java -jar zipstreams.jar
