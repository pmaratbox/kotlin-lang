# 0543 — Whitespace handling

Using the `jparsec` parser-combinator library, we wrap an integer parser (`Scanners.INTEGER.map { it.toInt() }`) with optional whitespace. `Scanners.WHITESPACES.optional(null)` consumes any leading/trailing spaces, and `Parsers.sequence(skip, num, skip)` runs the three parsers in order while keeping only the parsed number. Applied to the input `"  42  "`, the surrounding spaces are skipped by the combinator and the result `42` is printed.

## Run

    kotlin Whitespace.main.kts
