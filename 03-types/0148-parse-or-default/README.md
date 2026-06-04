# 0148 — Parse or Default

Parse "42" to 42 and "x" (invalid) to a default 0, printing `42 0`. Kotlin's `toIntOrNull` returns null on failure, so the elvis operator `?:` supplies the default.

## Run

    kotlinc OrDefault.kt -include-runtime -d ordefault.jar && java -jar ordefault.jar
