# 0066 — Multiple Assignment & Destructuring

Swap two variables (`a = 1`, `b = 2`) with a single multiple-assignment, then unpack the pair `(3, 4)` into two variables — printing `2 1` then `3 4`. Kotlin destructures `Pair`/data classes/lists with `val (x, y) = ...`; there is no in-place `a, b = b, a`, so the swap destructures `Pair(b, a)`.

## Run

    kotlinc Destructuring.kt -include-runtime -d destructuring.jar && java -jar destructuring.jar
