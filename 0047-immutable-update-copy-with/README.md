# 0047 — Immutable Update (Copy-with)

Make a copy of the point `(1, 2)` with its `x` changed to `9`, leaving the original intact, and print `original: (1, 2)` then `updated: (9, 2)`. A `data class` generates a `copy` method that clones the instance and overrides the named arguments — `p1.copy(x = 9)` — leaving the immutable original unchanged.

## Run

    kotlinc ImmutableUpdate.kt -include-runtime -d immutable.jar && java -jar immutable.jar
