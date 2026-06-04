# 0386 — Iterate and Take

Iterate f(x)=x*3 from 1 and take the first four values, printing `1 3 9 27`. Kotlin's `generateSequence` repeatedly applies the function, and `take` limits the count.

## Run

    kotlinc IterateTake.kt -include-runtime -d iteratetake.jar && java -jar iteratetake.jar
