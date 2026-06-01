# 0026 — Sets

Build a set from `1, 2, 2, 3` so the duplicate collapses, then print its `size: 3` and whether it contains `2` (`has 2: yes`) and `5` (`has 5: no`). `setOf(...)` builds a read-only `Set` that discards the duplicate; `.size` counts and the `in` operator (backed by `contains`) tests membership. `mutableSetOf` is the modifiable form, and the default implementation is a `LinkedHashSet`.

## Run

    kotlinc Sets.kt -include-runtime -d sets.jar && java -jar sets.jar
