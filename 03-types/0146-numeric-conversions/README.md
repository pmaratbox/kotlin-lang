# 0146 — Numeric Conversions

Truncate 3.9 to the int 3 and widen the int 3 to the float 3.0, printing `3 3.0`. Kotlin has no implicit numeric coercion, so conversions are explicit `toInt()` / `toDouble()` calls.

## Run

    kotlinc Conversions.kt -include-runtime -d conversions.jar && java -jar conversions.jar
