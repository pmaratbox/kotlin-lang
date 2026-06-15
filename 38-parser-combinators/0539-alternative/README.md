# 0539 — Alternative

Using the `jparsec` parser-combinator library, we build a choice parser with the `Parsers.or` combinator (the alternative operator). It takes two sub-parsers — the literal `"cat"` and the literal `"dog"` (each built from `Scanners.string(...)`) — and tries them in order, succeeding with the first that matches. Parsing the fixed input `"dog"` fails the `cat` branch and succeeds on the `dog` branch, printing `dog`.

## Run

    kotlin Alternative.main.kts
