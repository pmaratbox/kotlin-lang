# 0421 — Debounce (Virtual Time)

Implement debounce(window) on a virtual-time scheduler: emit a value only after a quiet gap of `window` ticks with no newer value. Kotlin's `PriorityQueue` with a `compareBy` comparator orders tasks by (time, insertion seq) for deterministic virtual time.

## Run

    kotlinc DebounceVirtualTime.kt -include-runtime -d debouncevirtualtime.jar && java -jar debouncevirtualtime.jar
