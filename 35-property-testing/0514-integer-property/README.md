# 0514 — Integer property

Uses the [kotest-property](https://kotest.io/docs/proptest/property-based-testing.html)
library. `io.kotest.property.forAll<Int, Int>` draws integers from kotest's
default `Arb<Int>` generator and verifies that addition is commutative
(`a + b == b + a`) over ~1000 generated pairs, throwing only if a counterexample
appears. Run programmatically via `runBlocking`, not through a test runner.

## Run

    kotlin IntegerProperty.main.kts
