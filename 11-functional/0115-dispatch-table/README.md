# 0115 — Dispatch Table

Store functions in a map keyed by name, then apply "add" and "mul" to (3,4), printing `7 12`. A Kotlin `mapOf` of name to lambda is looked up and invoked.

## Run

    kotlinc Table.kt -include-runtime -d table.jar && java -jar table.jar
