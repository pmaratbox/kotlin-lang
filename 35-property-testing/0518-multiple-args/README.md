# 0518 — Multiple arguments

This lesson uses the `kotest-property` library to run a property check programmatically (not via a test runner). It passes TWO generators (`Arb.int()`, `Arb.int()`) to `forAll`, which generates a pair of random integers `a, b` for each of ~100 iterations and checks the property that `max(a, b) >= a` and `max(a, b) >= b`. Because `forAll` is a suspend function it runs inside `runBlocking`, and it throws only when a counterexample is found — since the property is universally true, the check passes and we print `passed`.

## Run

    kotlin MultipleArgs.main.kts
