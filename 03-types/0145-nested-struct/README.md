# 0145 — Nested Struct

Model a person whose address is a nested struct, and print the city `London`. A `data class` field can itself be another `data class`, reached by chained dot access.

## Run

    kotlinc Struct.kt -include-runtime -d struct.jar && java -jar struct.jar
