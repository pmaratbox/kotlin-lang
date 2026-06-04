# 0318 — Kth Largest

Find the 2nd largest element of [3,2,1,5,6,4] using a heap, printing `5`. Kotlin keeps a size-2 min-heap (`PriorityQueue`) whose root is the kth largest.

## Run

    kotlinc KthLargest.kt -include-runtime -d kthlargest.jar && java -jar kthlargest.jar
