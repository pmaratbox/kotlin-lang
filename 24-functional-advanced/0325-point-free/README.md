# 0325 — Point-Free Style

Express "sum of squares" point-free (compose map-square with sum) and apply it to [1,2,3], printing `14`. A `compose` infix combinator builds the function without naming its argument.

## Run

    kotlinc PointFree.kt -include-runtime -d pointfree.jar && java -jar pointfree.jar
