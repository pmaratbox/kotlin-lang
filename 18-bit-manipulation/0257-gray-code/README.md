# 0257 — Gray Code

Print the Gray code (as decimals) for 0..3 `0 1 3 2`. A `map` over the range applies `n xor (n shr 1)` and `joinToString` formats the output.

## Run

    kotlinc GrayCode.kt -include-runtime -d graycode.jar && java -jar graycode.jar
