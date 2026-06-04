# 0248 — Catalan Numbers

Print the first five Catalan numbers `1 1 2 5 14`. A running `Long` applies the recurrence C(n+1)=C(n)*2*(2n+1)/(n+2).

## Run

    kotlinc CatalanNumber.kt -include-runtime -d catalannumber.jar && java -jar catalannumber.jar
