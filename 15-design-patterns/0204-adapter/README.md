# 0204 — Adapter

Adapt a Celsius source (100) to a Fahrenheit interface, printing `212`. The adapter wraps the source and implements the target interface in idiomatic Kotlin.

## Run

    kotlinc Adapter.kt -include-runtime -d adapter.jar && java -jar adapter.jar
