# 0463 — Array of primitives

Serialize the integer list `[1, 2, 3]` to a compact JSON array using the real Jackson library (`com.fasterxml.jackson.module:jackson-module-kotlin`). An `ObjectMapper` with the Kotlin module turns the Kotlin `List<Int>` into a JSON array via `writeValueAsString`, producing compact output with no extra whitespace.

## Run

    kotlin ArrayOfPrimitives.main.kts
