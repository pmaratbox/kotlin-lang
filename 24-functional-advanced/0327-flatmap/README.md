# 0327 — FlatMap

FlatMap [1,2,3] with x -> [x, x*10] and print the flattened result `1 10 2 20 3 30`. Kotlin's `flatMap` maps each element to a list and concatenates them.

## Run

    kotlinc Flatmap.kt -include-runtime -d flatmap.jar && java -jar flatmap.jar
