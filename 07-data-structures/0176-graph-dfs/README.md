# 0176 — Graph DFS

Depth-first traverse from node 0 of the graph 0:[1,2] 1:[0,3] 2:[0,3] 3:[1,2], printing visit order `0 1 3 2`. A recursive `dfs` guards revisits with a `MutableSet` and recurses on neighbors in list order.

## Run

    kotlinc Dfs.kt -include-runtime -d dfs.jar && java -jar dfs.jar
