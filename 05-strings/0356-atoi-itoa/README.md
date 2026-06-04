# 0356 — String<->Int Round Trip

Parse "-42" to the integer -42 and format it back to "-42", printing `-42 -42`. Hand-roll the digit accumulation and extraction loops rather than calling `toInt`/`toString`.

## Run

    kotlinc AtoiItoa.kt -include-runtime -d atoiitoa.jar && java -jar atoiitoa.jar
