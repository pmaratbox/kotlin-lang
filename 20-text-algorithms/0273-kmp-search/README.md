# 0273 — KMP Search

Use Knuth-Morris-Pratt to find all start indices of "ab" in "ababab", printing `0 2 4`. Kotlin's `IntArray` backs the prefix-function cleanly.

## Run

    kotlinc KmpSearch.kt -include-runtime -d kmpsearch.jar && java -jar kmpsearch.jar
