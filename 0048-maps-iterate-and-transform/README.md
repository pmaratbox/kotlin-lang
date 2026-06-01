# 0048 — Maps: Iterate & Transform

Build a map from letters to numbers (`a`->1, `b`->2, `c`->3), sum all its values, and print `sum: 6`. `mapOf("a" to 1, ...)` builds a read-only map, and `.values` plus the collection `sum()` total them. `forEach { (k, v) -> }` and `mapValues` iterate and transform.

## Run

    kotlinc MapTransform.kt -include-runtime -d maps.jar && java -jar maps.jar
