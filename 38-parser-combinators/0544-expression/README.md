# 0544 — Expression

Using the `jparsec` parser-combinator library, we build a parser entirely from combinators and run it on the fixed input `10+20+30`. `Scanners.INTEGER.map { it.toInt() }` parses a single integer, and the `sepBy1` combinator parses a one-or-more `+`-separated sequence of those integers into a `List<Int>`. We then `map` the list with `sum()` to fold it into the total, and `.parse(...)` runs the parser, printing `60`.

## Run

    kotlin Expression.main.kts
