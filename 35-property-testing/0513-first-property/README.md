# 0513 — First property

This lesson uses the `kotest-property` library to run a property check programmatically (not via a test runner). It uses `Arb.list(Arb.int())` to generate ~100 random integer lists and `forAll` to assert the property that reversing a list twice yields the original. Because `forAll` is a suspend function it runs inside `runBlocking`, and it throws only when a counterexample is found — since the property is universally true, the check passes and we print `passed`.

## Run

    kotlin FirstProperty.main.kts
