# 0007 — Collections

Build a list of the integers `1, 2, 3, 4, 5`, then print its count and its
first and last elements. `listOf(...)` builds a read-only `List`; `.size` is a
property and `.first()` / `.last()` are accessor functions (`[]` indexing also
works). `mutableListOf(...)` is the growable form.

## Run

    kotlinc Collections.kt -include-runtime -d collections.jar && java -jar collections.jar
