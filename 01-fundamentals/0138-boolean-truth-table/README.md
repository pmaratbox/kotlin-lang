# 0138 — Boolean Truth Table

For each (a,b) in (T,T),(T,F),(F,T),(F,F) print a, b, and a AND b, a OR b, a XOR b as lowercase booleans, one row per line. Kotlin's `Boolean` already renders as lowercase `true`/`false`, and infix `xor` reads cleanly.

## Run

    kotlinc TruthTable.kt -include-runtime -d truthtable.jar && java -jar truthtable.jar
