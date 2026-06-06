# 0406 — Filter Operator

Implement a filter operator that forwards only values passing a predicate, keeping the even numbers of 1..6. A push-based `Observable` is a function taking an `Observer`, and `filter` wraps the downstream observer to gate `next` on the predicate.

## Run

    kotlinc FilterOperator.kt -include-runtime -d filteroperator.jar && java -jar filteroperator.jar
