# 0049 — Zip & Enumerate

Pair the letters `a, b, c` with the numbers `1, 2, 3` position by position, formatting each pair as `key=value` and printing `a=1 b=2 c=3`. `letters.zip(nums)` pairs the two lists into a list of `Pair`s, and `joinToString` with a destructured `(k, n)` formats them. Their enumerate counterparts are `withIndex` and `mapIndexed`.

## Run

    kotlinc Zip.kt -include-runtime -d zip.jar && java -jar zip.jar
