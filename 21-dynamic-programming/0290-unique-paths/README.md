# 0290 — Unique Grid Paths

Count lattice paths from the top-left to bottom-right of a 3x3 grid moving right/down, printing `6`. A nested `Array(rows) { IntArray(cols) }` makes the grid DP natural in Kotlin.

## Run

    kotlinc UniquePaths.kt -include-runtime -d uniquepaths.jar && java -jar uniquepaths.jar
