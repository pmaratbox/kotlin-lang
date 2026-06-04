# 0357 — Zip Longest

Zip [1,2,3] with ["a","b"], filling the missing slot with "-", printing `1a 2b 3-`. Kotlin uses `getOrNull` to safely fall back to the filler when a list is exhausted.

## Run

    kotlinc ZipLongest.kt -include-runtime -d ziplongest.jar && java -jar ziplongest.jar
