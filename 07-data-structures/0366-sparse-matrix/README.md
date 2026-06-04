# 0366 — Sparse Matrix

Store only nonzero entries; with (1,1)=5 set, read (1,1) (5) and (0,0) (0), printing `5 0`. A HashMap keyed by a (row,col) Pair returns 0 via the elvis operator for missing keys.

## Run

    kotlinc SparseMatrix.kt -include-runtime -d sparsematrix.jar && java -jar sparsematrix.jar
