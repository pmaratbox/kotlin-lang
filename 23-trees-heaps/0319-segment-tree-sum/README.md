# 0319 — Segment Tree Range Sum

Build a segment tree over [1,2,3,4,5] and query the sum of indices 1..3 (inclusive), printing `9`. Kotlin uses an iterative array-backed segment tree with bitwise climbing.

## Run

    kotlinc SegmentTreeSum.kt -include-runtime -d segmenttreesum.jar && java -jar segmenttreesum.jar
