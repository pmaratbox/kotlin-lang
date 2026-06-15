# 0536 — Nested update

Using `kotlinx.collections.immutable`, build a nested persistent map `{user: {age: 30}}` with `persistentMapOf`, then update the nested `user.age` to `31` by rebuilding the inner persistent map with `.put("age", 31)` and `.put`-ing it back onto the outer map. Each `.put` RETURNS A NEW immutable map, so the original map and its nested map stay unchanged — printing the updated nested age (`31`) and the original nested age (`30`) demonstrates this.

## Run

    kotlin NestedUpdate.main.kts
