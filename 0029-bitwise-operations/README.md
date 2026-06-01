# 0029 — Bitwise Operations

Compute bitwise AND, OR, and XOR on `6` and `3`, plus a left shift of `6` by one bit, printing `and: 2`, `or: 7`, `xor: 5`, and `shift: 12`. Kotlin has no bitwise operator symbols — it uses infix functions instead: `and`, `or`, `xor`, and `shl` (shift left), with `shr`, `ushr`, and `inv` completing the set. `6 shl 1` doubles to 12.

## Run

    kotlinc Bitwise.kt -include-runtime -d bitwise.jar && java -jar bitwise.jar
