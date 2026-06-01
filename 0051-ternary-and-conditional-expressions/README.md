# 0051 — Ternary & Conditional Expressions

For each of `4` and `7`, choose `even` or `odd` with a single conditional expression and print `4: even` and `7: odd`. Kotlin has no ternary operator; instead `if`/`else` is an *expression* that returns a value: `if (cond) a else b`. `when` is the multi-branch expression form.

## Run

    kotlinc Ternary.kt -include-runtime -d ternary.jar && java -jar ternary.jar
