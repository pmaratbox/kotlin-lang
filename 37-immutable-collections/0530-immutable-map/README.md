# 0530 — Immutable map

Using `kotlinx.collections.immutable`, build a `persistentMapOf("a" to 1)` and call `.put("b", 2)`, which RETURNS A NEW persistent map instead of mutating in place. Printing the new map's keys (sorted) shows `a b`, while the original map is unchanged and still prints just `a`.

## Run

    kotlin ImmutableMap.main.kts
