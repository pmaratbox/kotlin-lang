# 0091 — Balanced Parentheses

Using a stack, check whether `(())` is balanced and whether `(()` is balanced, printing `yes` then `no`. Kotlin's `ArrayDeque` is used as a stack (`addLast`/`removeLast`); an empty stack at the end means balanced.

## Run

    kotlinc BalancedParens.kt -include-runtime -d balanced.jar && java -jar balanced.jar
