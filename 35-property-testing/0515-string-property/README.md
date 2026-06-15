# 0515 — String property

Uses the [kotest](https://kotest.io) property-testing library (`io.kotest:kotest-property-jvm`), run programmatically rather than through a test runner. `Arb.string()` is the generator that feeds random strings into `forAll`, which checks the property `(s + s).length == 2 * s.length` for each generated value and throws an `AssertionError` only on a counterexample. The property holds for every string, so the run completes and prints `passed`.

## Run

    kotlin StringProperty.main.kts
