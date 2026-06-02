# 0087 — Invert a Map

Invert the map `{a: 1, b: 2, c: 3}` (swap keys and values) and print the result sorted by the new key: `1:a 2:b 3:c`. `associate { (k, v) -> v to k }` builds the swapped map; `toSortedMap()` orders it by the new key.

## Run

    kotlinc InvertMap.kt -include-runtime -d invertmap.jar && java -jar invertmap.jar
