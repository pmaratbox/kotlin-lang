# 0541 — Separated list

Using the **jparsec** parser-combinator library, we build an integer parser from `Scanners.INTEGER.map { it.toInt() }` and combine it with the `.sepBy` combinator, passing `Scanners.isChar(',')` as the separator. Running `.parse("1,2,3")` produces a `List<Int>` of `[1, 2, 3]`, which we sum to print `6`.

## Run

    kotlin SeparatedList.main.kts
