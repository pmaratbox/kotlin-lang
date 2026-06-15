# 0520 — Finds a counterexample

Uses the **kotest-property** library to detect a deliberately *false* property:
"every non-negative integer is < 100". `forAll<Int>` generates integers and quickly
finds a value that violates the predicate, throwing an `AssertionError` (and emitting
a falsifying-example / shrink report). We catch that error to detect the failure, and
temporarily redirect `System.out` to a null stream so kotest's report never reaches
stdout — leaving only `found` printed.

## Run

    kotlin FindsCounterexample.main.kts
