# 0396 — Call Counter

Wrap a function so each call increments a counter; after five calls print `calls: 5`. A closure over a `var` captures mutable state idiomatically in Kotlin.

## Run

    kotlinc CallCounter.kt -include-runtime -d callcounter.jar && java -jar callcounter.jar
