# 0365 — Multiset Counts

Add 1,1,2 to a multiset; print the count of 1 (2), remove one 1, then print the count of 1 (1), as `2 1`. A HashMap from element to count increments on add and decrements on remove.

## Run

    kotlinc MultisetCount.kt -include-runtime -d multisetcount.jar && java -jar multisetcount.jar
