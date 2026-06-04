# 0291 — Minimum Path Sum

Find the minimum path sum through [[1,3,1],[1,5,1],[4,2,1]] moving right/down, printing `7`. Guarding edges with `Int.MAX_VALUE` keeps the `minOf` recurrence clean in Kotlin.

## Run

    kotlinc MinPathSum.kt -include-runtime -d minpathsum.jar && java -jar minpathsum.jar
