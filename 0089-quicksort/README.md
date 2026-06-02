# 0089 — Quicksort

Sort the list `3, 1, 4, 1, 5, 2` using quicksort (partition around a pivot, then recurse on each side) and print the result: `1 1 2 3 4 5`. `filter` partitions the tail; list concatenation (`+`) rebuilds the sorted list around the pivot.

## Run

    kotlinc Quicksort.kt -include-runtime -d quicksort.jar && java -jar quicksort.jar
