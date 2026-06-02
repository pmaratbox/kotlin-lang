# 0074 — Run-Length Encoding

Run-length encode the string `aaabbc` (each run of a repeated character becomes the character followed by its count), printing `a3b2c1`. The inner `while` counts a run; `StringBuilder.append` chains the character and its count.

## Run

    kotlinc RunLength.kt -include-runtime -d rle.jar && java -jar rle.jar
