# 0009 — Maps

Build a map with `mapOf(...)`, look up `"two"`, and print its value and the
map's size. `"one" to 1` builds a `Pair`, and `mapOf` returns a read-only
`Map`. Indexing `map["two"]` returns `Int?` (null if the key is absent), and
`.size` counts entries. `mutableMapOf` is the mutable form.

## Run

    kotlinc Maps.kt -include-runtime -d maps.jar && java -jar maps.jar
