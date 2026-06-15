# 0532 — Update an element

Using `kotlinx.collections.immutable`, create a persistent list `[1, 2, 3]` with `persistentListOf` and call `.set(0, 99)` to update the element at index 0. The `set` operation does not mutate in place; it RETURNS A NEW persistent list, leaving the original unchanged. Printing the new list then the original shows `99 2 3` followed by the untouched `1 2 3`.

## Run

    kotlin UpdateElement.main.kts
