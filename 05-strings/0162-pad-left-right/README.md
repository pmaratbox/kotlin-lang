# 0162 — Pad Left and Right

Left-pad and right-pad "5" with spaces to width 3 and print both joined by a pipe: `  5|5  `. left pad -> "  5", right pad -> "5  "; print left + "|" + right (note the trailing two spaces).

## Run

    kotlinc LeftRight.kt -include-runtime -d leftright.jar && java -jar leftright.jar
