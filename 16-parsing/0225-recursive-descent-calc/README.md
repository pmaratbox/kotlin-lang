# 0225 — Recursive Descent Calculator

Parse and evaluate "2+3*4" honoring precedence, printing `14`. A small `Parser` class with `expr`/`term`/`factor` methods encodes the grammar directly.

## Run

    kotlinc RecursiveDescentCalc.kt -include-runtime -d recursivedescentcalc.jar && java -jar recursivedescentcalc.jar
