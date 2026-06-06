# 0436 — Debounce (Virtual Time)

Use the library's debounce operator on a virtual/test scheduler to emit a value only after a quiet window. Built with kotlinx.coroutines Flow's `debounce` operator running under `runTest`, which auto-advances virtual time.

## Run

    kotlin DebounceVirtualTime.main.kts
