# 0198 — Seeded LCG PRNG

Implement a linear congruential generator next=(5*x+3) mod 16 seeded at 1 and print its first 3 outputs `8 11 10`. A plain `var` and the `%` operator give the deterministic recurrence without touching `kotlin.random`.

## Run

    kotlinc LcgPrng.kt -include-runtime -d lcgprng.jar && java -jar lcgprng.jar
