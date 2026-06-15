# 0542 — Map / transform

Using the **jparsec** parser-combinator library, `Scanners.INTEGER` parses a run of digits and the **`map`** combinator transforms the parsed value. Here the integer parser is mapped to `it.toInt() * 2`, so parsing the fixed input `"21"` yields `21` and the `map` doubles it to `42`. The result still comes from running the combinator parser via `.parse(input)` — no manual string handling.

## Run

    kotlin MapTransform.main.kts
