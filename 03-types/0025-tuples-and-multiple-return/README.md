# 0025 — Tuples & Multiple Return

Return both the smaller and larger of `3` and `7` from one function, unpacking the pair to print `min: 3` and `max: 7`. `Pair<Int, Int>` holds two values and a destructuring declaration `val (lo, hi) = ...` unpacks them via the `component1()`/`component2()` operators. `Triple` covers three; for more, a `data class` with named fields is clearer.

## Run

    kotlinc Tuples.kt -include-runtime -d tuples.jar && java -jar tuples.jar
