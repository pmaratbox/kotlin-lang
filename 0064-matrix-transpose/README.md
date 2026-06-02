# 0064 — Matrix Transpose

Transpose the 2x3 matrix `[[1, 2, 3], [4, 5, 6]]` (swap rows and columns) and print the resulting 3x2 matrix, one row per line: `1 4`, `2 5`, `3 6`. Each transposed row is `(0 until rows).map { i -> matrix[i][j] }` — column `j` gathered from every row.

## Run

    kotlinc MatrixTranspose.kt -include-runtime -d transpose.jar && java -jar transpose.jar
