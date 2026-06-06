# 0434 — FlatMap (mergeMap)

Use the library's flatMap/mergeMap on a virtual/test scheduler, mapping each outer value to a timed inner stream and merging them. Uses kotlinx.coroutines Flow `flatMapMerge` with `runTest` virtual time auto-advancing the inner `delay`s.

## Run

    kotlin FlatmapStreams.main.kts
