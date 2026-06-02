# 0086 — Sort a Map by Value

Sort the map `{a: 3, b: 1, c: 2}` by value in ascending order and print the entries: `b:1 c:2 a:3`. `entries.sortedBy { it.value }` returns the entries ordered by value.

## Run

    kotlinc SortMapByValue.kt -include-runtime -d sortmap.jar && java -jar sortmap.jar
