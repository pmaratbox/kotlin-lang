# 0247 — Horner Polynomial Eval

Evaluate 2x^2+3x+1 at x=2 using the Horner method, printing `15`. A `fold` over the coefficients nests the multiplications.

## Run

    kotlinc HornerEval.kt -include-runtime -d hornereval.jar && java -jar hornereval.jar
