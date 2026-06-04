# 0383 — Partition Into Runs

Partition [1,1,2,3,3,3] into runs of equal adjacent elements, printing `1 1|2|3 3 3`. Idiomatic Kotlin builds runs by appending to the last group when the element matches.

## Run

    kotlinc PartitionRuns.kt -include-runtime -d partitionruns.jar && java -jar partitionruns.jar
