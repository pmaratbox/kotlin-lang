# 0308 — Strongly Connected Components

Count the strongly connected components of 0->1,1->2,2->0,2->3, printing `2`. Kosaraju's two passes — finish-order DFS then a reverse-graph DFS — group `{0,1,2}` and `{3}`.

## Run

    kotlinc SccCount.kt -include-runtime -d scccount.jar && java -jar scccount.jar
