# 0359 — Flatten Deeply

Flatten the arbitrarily nested structure [1,[2,[3,4]],5] into `1 2 3 4 5`. Kotlin models the heterogeneous nesting with `Any` and recurses via `flatMap` on each `List<*>`.

## Run

    kotlinc FlattenDeep.kt -include-runtime -d flattendeep.jar && java -jar flattendeep.jar
