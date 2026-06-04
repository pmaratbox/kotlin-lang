# 0341 — Recursive List Reverse

Reverse [1,2,3] using recursion (no built-in reverse), printing `3 2 1`. Recurse on the tail and append the head, then join with spaces via `joinToString`.

## Run

    kotlinc RecursiveListReverse.kt -include-runtime -d recursivelistreverse.jar && java -jar recursivelistreverse.jar
