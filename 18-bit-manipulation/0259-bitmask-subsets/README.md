# 0259 — Enumerate Submasks

Enumerate all submasks of the mask 5 (101) in descending order `5 4 1 0`. The loop `sub = (sub - 1) and mask` walks every submask down to 0.

## Run

    kotlinc BitmaskSubsets.kt -include-runtime -d bitmasksubsets.jar && java -jar bitmasksubsets.jar
