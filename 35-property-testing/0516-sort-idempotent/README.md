# 0516 — Sort is idempotent

Uses the [kotest](https://kotest.io/) property-testing library. `forAll` draws
~100 integer lists from the `Arb.list(Arb.int())` generator and checks the
property that sorting an already-sorted list equals sorting once
(`sort(sort(xs)) == sort(xs)`). The property is universally true, so `forAll`
never throws and the program prints `passed`.

## Run

    kotlin SortIdempotent.main.kts
