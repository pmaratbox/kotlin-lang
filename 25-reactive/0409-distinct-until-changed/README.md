# 0409 — Distinct Until Changed

Implement distinctUntilChanged, dropping consecutive duplicate values from 1,1,2,2,2,3,1. A closure captures the last emitted value and forwards only when the new value differs, using Kotlin's `!=` for structural comparison.

## Run

    kotlinc DistinctUntilChanged.kt -include-runtime -d distinctuntilchanged.jar && java -jar distinctuntilchanged.jar
