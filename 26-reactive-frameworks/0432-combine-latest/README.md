# 0432 — Combine Latest

Use the library's combineLatest operator on a virtual/test scheduler, emitting the latest pair whenever either timed source emits. Uses kotlinx.coroutines Flow with the `combine` operator over `runTest` virtual time, pairing the latest value from each timed `flow {}` source.

## Run

    kotlin CombineLatest.main.kts
