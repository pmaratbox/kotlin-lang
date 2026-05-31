# 0017 — Iterators

Take the numbers 1 through 5, keep the even ones, double each, and add them up — a filter, then a map, then a reduce — printing the final sum. Kotlin's standard library puts `filter`, `map`, and `sum` directly on `List`, with `it` as the implicit lambda parameter. These eager operations build a new list at each step; for a large pipeline `nums.asSequence()...` would make them lazy like Java Streams, but for a five-element list the direct form is clearest.

## Run

    kotlinc Iterators.kt -include-runtime -d iterators.jar && java -jar iterators.jar
