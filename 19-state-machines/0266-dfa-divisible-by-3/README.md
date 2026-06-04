# 0266 — DFA: Divisible by 3

Use a 3-state DFA over binary input to test whether "110" (6, yes) and "100" (4, no) are divisible by 3, printing `yes no`. The state tracks value mod 3 as each bit folds in via Kotlin's `Char` arithmetic.

## Run

    kotlinc DfaDivisibleBy3.kt -include-runtime -d dfadivisibleby3.jar && java -jar dfadivisibleby3.jar
