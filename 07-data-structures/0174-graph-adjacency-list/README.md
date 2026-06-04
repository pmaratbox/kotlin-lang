# 0174 — Graph Adjacency List

Build an undirected graph with adjacency 0:[1,2] 1:[0,3] 2:[0,3] 3:[1,2] and print the neighbors of node 0: `1 2`. A `Map<Int, List<Int>>` models the adjacency list, read with `getValue`.

## Run

    kotlinc AdjacencyList.kt -include-runtime -d adjacencylist.jar && java -jar adjacencylist.jar
