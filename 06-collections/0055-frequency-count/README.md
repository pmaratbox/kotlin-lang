# 0055 — Frequency Count

Count how many times each letter appears in `banana` and print the per-letter counts in alphabetical order: `a:3 b:1 n:2`. `groupingBy { it }.eachCount()` tallies the letters in one pass; `toSortedMap()` then orders them for alphabetical output.

## Run

    kotlinc FrequencyCount.kt -include-runtime -d frequency.jar && java -jar frequency.jar
