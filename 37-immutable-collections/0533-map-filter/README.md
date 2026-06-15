# 0533 — Map & filter

Using `kotlinx.collections.immutable`, start from a `persistentListOf(1, 2, 3, 4, 5)` and transform it with `filter` (keep the even values) followed by `map` (multiply each by 10). Both `filter` and `map` RETURN NEW immutable collections, leaving the original persistent list unchanged; the result is collected back with `toPersistentList()` and printed space-joined.

## Run

    kotlin MapFilter.main.kts
