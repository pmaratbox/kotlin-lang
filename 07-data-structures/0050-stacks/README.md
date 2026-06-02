# 0050 — Stacks

Push `1`, `2`, and `3` onto a stack, then pop them all off and print them in last-in-first-out order: `3 2 1`. Kotlin's `ArrayDeque` (standard library) works as a stack via `addLast` and `removeLast`. A `MutableList` with `removeAt(lastIndex)` is the other common approach.

## Run

    kotlinc Stacks.kt -include-runtime -d stacks.jar && java -jar stacks.jar
