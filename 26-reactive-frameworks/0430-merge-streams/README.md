# 0430 — Merge Streams

Use the library's merge operator on a virtual/test scheduler to interleave two timed streams by emission time. Uses kotlinx.coroutines Flow's `merge` operator, with delays auto-advanced by `runTest`'s virtual time.

## Run

    kotlin MergeStreams.main.kts
