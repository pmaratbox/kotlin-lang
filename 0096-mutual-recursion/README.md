# 0096 — Mutual Recursion

Using two mutually recursive functions `isEven` and `isOdd` (each calling the other), report whether `4` and `3` are even, printing `even` and `odd`. Top-level functions see each other regardless of order, so the two recurse mutually to the zero base case.

## Run

    kotlinc MutualRecursion.kt -include-runtime -d mutual.jar && java -jar mutual.jar
