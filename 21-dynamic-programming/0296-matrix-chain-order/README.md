# 0296 — Matrix Chain Order

Find the minimum scalar multiplications to multiply matrices with dimensions [10,20,30,40], printing `18000`. Interval DP over chain splits maps cleanly onto Kotlin's nested ranges.

## Run

    kotlinc MatrixChainOrder.kt -include-runtime -d matrixchainorder.jar && java -jar matrixchainorder.jar
