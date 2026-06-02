# 0093 — Matrix Multiply

Multiply the 2x2 matrices `[[1, 2], [3, 4]]` and `[[5, 6], [7, 8]]` and print the product, one row per line: `19 22` and `43 50`. `Array<IntArray>` holds the matrices; the triple loop accumulates each entry's dot product.

## Run

    kotlinc MatrixMultiply.kt -include-runtime -d matmul.jar && java -jar matmul.jar
