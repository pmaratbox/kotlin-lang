# 0384 — Scan (Cumulative Product)

Produce the running products of [1,2,3,4], printing `1 2 6 24`. Kotlin's `runningReduce` performs a left scan, emitting each intermediate product.

## Run

    kotlinc ScanProduct.kt -include-runtime -d scanproduct.jar && java -jar scanproduct.jar
