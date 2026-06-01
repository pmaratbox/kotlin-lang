# 0024 — Sorting & Comparators

Sort `[3, 1, 2]` ascending, then again with a custom comparator that reverses the order, printing `asc: 1 2 3` and `desc: 3 2 1`. `sorted()` returns a new list by natural order; `sortedWith` takes a custom `Comparator`, and `compareByDescending { it }` builds the descending one from a selector. The in-place forms are `sort()` / `sortWith(...)` on a `MutableList`.

## Run

    kotlinc Sorting.kt -include-runtime -d sorting.jar && java -jar sorting.jar
