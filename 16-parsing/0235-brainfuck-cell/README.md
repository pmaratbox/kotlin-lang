# 0235 — Brainfuck Cell

Interpret the Brainfuck program "+++" on a single zeroed cell and print the cell value `3`. A `when` over each instruction increments or decrements the one cell.

## Run

    kotlinc BrainfuckCell.kt -include-runtime -d brainfuckcell.jar && java -jar brainfuckcell.jar
