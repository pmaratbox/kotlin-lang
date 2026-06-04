# 0361 — Frequency Sort

Sort [1,1,2,3,3,3] by descending frequency (ties keep first-seen order), printing `3 3 3 1 1 2`. Kotlin's `groupBy` preserves first-seen key order, and a stable `sortedByDescending` keeps ties intact.

## Run

    kotlinc FrequencySort.kt -include-runtime -d frequencysort.jar && java -jar frequencysort.jar
