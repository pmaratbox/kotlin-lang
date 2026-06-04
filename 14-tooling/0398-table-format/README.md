# 0398 — Aligned Table

Format the rows (a,1),(bb,22) with the first column left-padded to the widest value, printing two aligned rows. `maxOf` finds the column width and `padEnd` aligns each cell.

## Run

    kotlinc TableFormat.kt -include-runtime -d tableformat.jar && java -jar tableformat.jar
