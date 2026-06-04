# 0267 — Game of Life Step

Advance one step of a vertical blinker on a 3x3 grid (it becomes horizontal); print the grid using . and #. Nested ranges count live neighbours into a fresh `Array` of `BooleanArray` in Kotlin.

## Run

    kotlinc GameOfLifeStep.kt -include-runtime -d gameoflifestep.jar && java -jar gameoflifestep.jar
