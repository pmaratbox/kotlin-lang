# 0065 — Merge Sort

Sort the list `3, 1, 4, 1, 5, 2` using merge sort (recursively split in half, then merge the sorted halves) and print the result: `1 1 2 3 4 5`. `mergeSort` recurses on `subList` views; `merge` drains the smaller front element from each half into a new list.

## Run

    kotlinc MergeSort.kt -include-runtime -d mergesort.jar && java -jar mergesort.jar
