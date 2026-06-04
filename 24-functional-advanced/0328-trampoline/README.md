# 0328 — Trampoline

Sum 1..100 with a trampolined recursion that avoids deep stacks, printing `5050`. Each step returns a `Bounce` thunk that a `tailrec` driver loops over.

## Run

    kotlinc Trampoline.kt -include-runtime -d trampoline.jar && java -jar trampoline.jar
