# 0534 — Set union

Using `kotlinx.collections.immutable`, create two persistent sets `{1,2,3}` and `{3,4,5}` with `persistentSetOf`, then compute their union with `addAll`. The operation RETURNS A NEW `PersistentSet`; the original sets stay unchanged. The result is sorted before printing for deterministic output.

## Run

    kotlin SetUnion.main.kts
