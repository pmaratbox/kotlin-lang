# 0167 — Top-K Frequent

Find the 2 most frequent elements of [a,b,a,c,b,a], printing `a b`. `groupingBy { it }.eachCount()` tallies, then a stable `sortedByDescending` picks the top k.

## Run

    kotlinc KFrequent.kt -include-runtime -d kfrequent.jar && java -jar kfrequent.jar
