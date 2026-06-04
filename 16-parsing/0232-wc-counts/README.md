# 0232 — Word/Line/Char Counts

For the text "a b\nc" report words, lines, and characters, printing `3 2 5`. Splitting on whitespace counts words while `length` and a newline count give chars and lines.

## Run

    kotlinc WcCounts.kt -include-runtime -d wccounts.jar && java -jar wccounts.jar
