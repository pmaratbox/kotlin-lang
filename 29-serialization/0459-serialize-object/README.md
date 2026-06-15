# 0459 — Serialize an object

Serialize a typed Kotlin object to a compact JSON string using the real `jackson-module-kotlin` library: an `ObjectMapper` with `registerKotlinModule()` reads the `data class`'s constructor properties and `writeValueAsString` emits JSON. Fields are declared alphabetically (`age` before `name`) so the output keys are alphabetical and the JSON is compact with no extra whitespace.

## Run

    kotlin SerializeObject.main.kts
