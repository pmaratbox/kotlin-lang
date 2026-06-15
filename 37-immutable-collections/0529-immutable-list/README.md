# 0529 — Immutable list

Using `kotlinx.collections.immutable`, build a persistent list with `persistentListOf(1, 2, 3)` and call `.add(4)`. The persistent `add` operation RETURNS A NEW list rather than mutating in place, so the original list stays unchanged. We print the new list (`1 2 3 4`) then the untouched original (`1 2 3`), both space-joined via `joinToString(" ")`.

## Run

    kotlin ImmutableList.main.kts
