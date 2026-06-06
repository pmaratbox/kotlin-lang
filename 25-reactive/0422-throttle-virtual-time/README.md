# 0422 — Throttle (Virtual Time)

Implement throttle(window) (leading edge) on a virtual-time scheduler: emit a value, then suppress further values for `window` ticks. A `PriorityQueue` with a `compareBy` comparator on (time, seq) keeps event ordering deterministic.

## Run

    kotlinc ThrottleVirtualTime.kt -include-runtime -d throttlevirtualtime.jar && java -jar throttlevirtualtime.jar
