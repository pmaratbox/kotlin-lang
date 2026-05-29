# 0012 — Enums

Define a `Color` enum (`RED`, `GREEN`, `BLUE`) and print the position of `GREEN`
(1) and `BLUE` (2). An `enum class` member exposes its zero-based declaration
position as the `.ordinal` property.

## Run

    kotlinc Enums.kt -include-runtime -d enums.jar && java -jar enums.jar
