# 0428 — Scan (Running Fold)

Use the library's scan operator to emit the running sum of 1, 2, 3, 4. Uses kotlinx.coroutines Flow's `scan(0){acc,x->acc+x}` operator, dropping the first emission since Flow's scan emits the seed first.

## Run

    kotlin ScanAccumulate.main.kts
