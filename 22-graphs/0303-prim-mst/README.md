# 0303 — Prim MST

Compute the MST total weight of the chain (0,1,1),(1,2,2),(2,3,3) with Prim, printing `6`. A `PriorityQueue` ordered by edge weight grows the tree one cheapest crossing edge at a time.

## Run

    kotlinc PrimMst.kt -include-runtime -d primmst.jar && java -jar primmst.jar
