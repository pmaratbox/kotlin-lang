# 0095 — Guard Clauses

Classify each of `-1`, `0`, and `5` using guard clauses (an early return for each special case) and print `negative`, `zero`, and `positive`. Early `return`s handle the special cases; Kotlin also has `when`, but guard clauses keep the flow flat.

## Run

    kotlinc GuardClauses.kt -include-runtime -d guard.jar && java -jar guard.jar
