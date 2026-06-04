# 0306 — Reconstruct Shortest Path

On the Dijkstra graph 0->1(4),0->2(1),2->1(2),1->3(1),2->3(5), print the actual shortest path from 0 to 3 `0 2 1 3`. A `prev` array records predecessors during relaxation, then the path is backtracked and `reversed`.

## Run

    kotlinc ShortestPathReconstruct.kt -include-runtime -d shortestpathreconstruct.jar && java -jar shortestpathreconstruct.jar
