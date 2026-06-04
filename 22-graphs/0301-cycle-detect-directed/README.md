# 0301 — Directed Cycle Detection

Detect a cycle in the digraph 0->1,1->2,2->0, printing `cycle`. A local `dfs` function with white/gray/black `color` codes spots the back edge.

## Run

    kotlinc CycleDetectDirected.kt -include-runtime -d cycledetectdirected.jar && java -jar cycledetectdirected.jar
