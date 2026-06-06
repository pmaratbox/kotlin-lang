# 0429 — Take Operator

Use the library's take operator to take the first 3 values of an unbounded stream, then complete. Uses kotlinx.coroutines Flow with the `take` operator on an unbounded `flow {}` source, signalling completion via `onCompletion`.

## Run

    kotlin TakeOperator.main.kts
