# 0172 — Ring Buffer

Push 1,2,3,4,5 into a fixed capacity-3 ring buffer (overwriting oldest) and print the final contents `3 4 5`. A `head` index plus modular arithmetic over an `IntArray` keeps the oldest element overwritten in place.

## Run

    kotlinc Buffer.kt -include-runtime -d buffer.jar && java -jar buffer.jar
