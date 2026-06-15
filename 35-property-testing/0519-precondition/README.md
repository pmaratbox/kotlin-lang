# 0519 — Precondition / filter

This lesson uses the `kotest-property` library to run a property check programmatically (not via a test runner). It applies a precondition with `Arb.int().filter { it > 0 && it < Int.MAX_VALUE }`, a constrained generator that discards any candidate failing the predicate so only positive integers (below `Int.MAX_VALUE`, to avoid `n + 1` overflow) are ever fed to the property. `forAll` then checks `n + 1 > n` over ~100 generated positives. Because `forAll` is a suspend function it runs inside `runBlocking`, and it throws only on a counterexample — since the property holds for every positive `n`, the check passes and we print `passed`.

## Run

    kotlin Precondition.main.kts
