# 0059 — Group By

Group the words `one`, `two`, `three` by their length and print each length with its words, in ascending order of length: `3:[one,two] 5:[three]`. `groupBy { it.length }` builds the map in one pass; `toSortedMap()` orders the keys for ascending output.

## Run

    kotlinc GroupBy.kt -include-runtime -d groupby.jar && java -jar groupby.jar
