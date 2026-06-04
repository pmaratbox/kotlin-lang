# 0249 — Binomial Coefficient

Compute C(5,2) without overflow and print `10`. The multiplicative formula keeps a running `Long` product divisible at each step.

## Run

    kotlinc BinomialCoefficient.kt -include-runtime -d binomialcoefficient.jar && java -jar binomialcoefficient.jar
