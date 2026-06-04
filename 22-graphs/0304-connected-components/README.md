# 0304 — Connected Components

Count the connected components of the undirected graph with edges (0,1),(1,2),(3,4) over nodes 0..4, printing `2`. A local recursive `dfs` marks each component, counting one per unvisited start.

## Run

    kotlinc ConnectedComponents.kt -include-runtime -d connectedcomponents.jar && java -jar connectedcomponents.jar
