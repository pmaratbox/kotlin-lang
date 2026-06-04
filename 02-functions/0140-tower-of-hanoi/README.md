# 0140 — Tower of Hanoi

Count the moves needed to solve Tower of Hanoi for 3 disks recursively and print `7`. An expression-bodied `fun` captures the `2*moves(n-1)+1` recurrence directly.

## Run

    kotlinc OfHanoi.kt -include-runtime -d ofhanoi.jar && java -jar ofhanoi.jar
