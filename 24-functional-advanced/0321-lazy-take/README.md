# 0321 — Lazy Take

Build a lazy sequence of the natural numbers and take the first five, printing `1 2 3 4 5`. Kotlin's `generateSequence` yields a lazy infinite stream.

## Run

    kotlinc LazyTake.kt -include-runtime -d lazytake.jar && java -jar lazytake.jar
