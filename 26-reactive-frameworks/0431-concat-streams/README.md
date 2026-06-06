# 0431 — Concat Streams

Use the library's concat operator so the second stream starts only after the first completes. Built with kotlinx.coroutines Flow using `flowOf(first, second).flattenConcat()`.

## Run

    kotlin ConcatStreams.main.kts
