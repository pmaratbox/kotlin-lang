# 0070 — Digit Sum

Sum the decimal digits of `1234` (repeatedly take the last digit with `% 10` and drop it with `/ 10`) and print the total: `10`. `Int` division `n /= 10` truncates, dropping the last digit each iteration.

## Run

    kotlinc DigitSum.kt -include-runtime -d digitsum.jar && java -jar digitsum.jar
