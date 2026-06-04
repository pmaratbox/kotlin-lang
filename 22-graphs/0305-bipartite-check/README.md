# 0305 — Bipartite Check

Check bipartiteness of a 4-cycle 0-1-2-3-0 (yes) and a triangle 0-1-2-0 (no), printing `yes no`. BFS 2-coloring with an `xor 1` flip reports a conflict on any odd cycle.

## Run

    kotlinc BipartiteCheck.kt -include-runtime -d bipartitecheck.jar && java -jar bipartitecheck.jar
