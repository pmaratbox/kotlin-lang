# 0019 — Recursion

Define a recursive `factorial(n)` that multiplies `n` by `factorial(n - 1)` until it bottoms out at `1`, then print `factorial(5) = 120`. Kotlin can eliminate tail calls when a function is marked `tailrec`, but multiplying after the recursive call is not tail-recursive, so it uses the JVM stack. The parameter is `Int` while the result is `Long` — Kotlin never silently widens `Int` to `Long`, hence the `1L` base case — because `factorial` outgrows a 32-bit `Int` quickly.

## Run

    kotlinc Recursion.kt -include-runtime -d recursion.jar && java -jar recursion.jar
