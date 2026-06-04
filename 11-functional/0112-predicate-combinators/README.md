# 0112 — Predicate Combinators

Combine predicates with AND/OR/NOT: test `isEven AND isPositive` on 4 (yes) and -4 (no), printing `yes no`. A combinator takes two predicate lambdas and returns their conjunction.

## Run

    kotlinc Combinators.kt -include-runtime -d combinators.jar && java -jar combinators.jar
