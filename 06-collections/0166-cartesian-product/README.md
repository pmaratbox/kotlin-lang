# 0166 — Cartesian Product

Print the cartesian product of [1,2] and ["a","b"] as `1a 1b 2a 2b`. `flatMap` over the outer list with a nested `map` builds every pair.

## Run

    kotlinc Product.kt -include-runtime -d product.jar && java -jar product.jar
