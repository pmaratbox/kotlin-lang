# 0203 — Prototype (Clone)

Clone a prototype object holding 1, mutate the clone to 2, and show the original is unchanged, printing `1 2`. Kotlin's data class `copy()` produces an independent clone.

## Run

    kotlinc Prototype.kt -include-runtime -d prototype.jar && java -jar prototype.jar
