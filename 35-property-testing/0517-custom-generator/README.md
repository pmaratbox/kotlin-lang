# 0517 — Custom generator

Uses the **kotest-property** library to build a *custom* input generator. Starting
from the built-in `Arb.int()`, the `.map` combinator transforms each integer with
`n -> n * 2` to produce an arbitrary that only ever yields even numbers. The property
"every generated value is even" is checked programmatically with `forAll`, which
throws an `AssertionError` only when it finds a counterexample — none exists here, so
the program prints `passed`.

## Run

    kotlin CustomGenerator.main.kts
