# 0407 — Scan (Running Fold)

Implement a scan operator that emits the running accumulation; produce the running sums of 1, 2, 3, 4. Kotlin closures capture the mutable `state` var so each `next` updates and re-emits the fold.

## Run

    kotlinc ScanAccumulate.kt -include-runtime -d scanaccumulate.jar && java -jar scanaccumulate.jar
