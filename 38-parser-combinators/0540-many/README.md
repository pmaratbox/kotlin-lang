# 0540 — Many (repetition)

Using the `jparsec` library, we build a parser with the `.many()` combinator, which repeats its underlying parser zero-or-more times and collects each match into a list. We take `Scanners.isChar('a')` (mapped to a value via `.retn('a')`), apply `.many()`, and run it over the fixed input `"aaaa"`. The result is a list of four parsed elements, so we print its size (`4`).

## Run

    kotlin Many.main.kts
