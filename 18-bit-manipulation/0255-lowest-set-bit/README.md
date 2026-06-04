# 0255 — Lowest Set Bit

Isolate the lowest set bit of 12 (1100), printing `4`. The idiom `x and (-x)` uses two's-complement negation to mask off all but the lowest bit.

## Run

    kotlinc LowestSetBit.kt -include-runtime -d lowestsetbit.jar && java -jar lowestsetbit.jar
