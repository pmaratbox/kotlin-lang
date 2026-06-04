# 0302 — Kruskal MST

Compute the MST total weight of edges (0,1,1),(1,2,2),(0,2,3) with union-find, printing `3`. A small `UnionFind` class with path compression joins disjoint sets as edges are scanned in `sortedBy` order.

## Run

    kotlinc KruskalMst.kt -include-runtime -d kruskalmst.jar && java -jar kruskalmst.jar
