# 0531 — Immutable set

Using `kotlinx.collections.immutable`, create a persistent set `{1, 2, 3}` and call `.add(4)`. The `add` operation RETURNS A NEW set rather than mutating in place, so the original set is left unchanged. Printing the new set's size (`4`) and then the original's size (`3`) demonstrates the immutability.

## Run

    kotlin ImmutableSet.main.kts
