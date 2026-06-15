# 0535 — Prepend & append

Using `kotlinx.collections.immutable`, build a `persistentListOf(2, 3)` and add to both
ends: prepend `1` with `add(0, 1)` (insert at index 0) and append `4` with `add(4)`.
Each call RETURNS A NEW persistent list, leaving the original unchanged. The final list
is printed space-joined.

## Run

    kotlin PrependAppend.main.kts
