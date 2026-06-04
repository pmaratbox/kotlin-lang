# 0360 — Interleave Lists

Interleave [1,3,5] and [2,4,6] element by element, printing `1 2 3 4 5 6`. Kotlin's `zip` pairs the lists and `flatMap` flattens each pair back into the alternating sequence.

## Run

    kotlinc InterleaveLists.kt -include-runtime -d interleavelists.jar && java -jar interleavelists.jar
