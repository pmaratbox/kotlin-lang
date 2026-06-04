# 0251 — Set, Clear, Toggle Bit

On bit position 1: set it on 0 (->2), clear it on 2 (->0), toggle it on 0 (->2), printing `2 0 2`. Kotlin uses the infix `or`, `and`, `xor`, `shl`, and `inv()` operators on Int.

## Run

    kotlinc SetClearToggleBit.kt -include-runtime -d setcleartogglebit.jar && java -jar setcleartogglebit.jar
