# 0004 — Conditionals

Compare `n` against 10 and print whether it's less, equal, or greater.
Kotlin's `if`/`else` is an expression (returns a value), so
`val s = if (n < 10) "small" else "big"` is idiomatic. Kotlin's `==` is
structural (calls `equals()`) — for primitives like `Int` that's value
comparison; use `===` to compare references. Edit `n` to `10` or `15` to
exercise the other branches.

## Run

    kotlinc Conditionals.kt -include-runtime -d conditionals.jar && java -jar conditionals.jar
