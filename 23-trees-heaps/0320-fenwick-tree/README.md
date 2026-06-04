# 0320 — Fenwick Tree Prefix Sum

Build a Fenwick (BIT) tree over [1,2,3,4,5] and query the prefix sum of the first 4 elements, printing `10`. Kotlin implements the BIT with `i and (-i)` low-bit stepping over an `IntArray`.

## Run

    kotlinc FenwickTree.kt -include-runtime -d fenwicktree.jar && java -jar fenwicktree.jar
