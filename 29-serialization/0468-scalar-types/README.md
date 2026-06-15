# 0468 — Scalar types

Serialize a data class with `active: Boolean`, `count: Int`, and `label: String` fields (declared alphabetically) to compact JSON using the real Jackson library via `jackson-module-kotlin`. The `ObjectMapper` with `registerKotlinModule()` emits scalar values directly — booleans as lowercase `true`/`false`, integers, and quoted strings.

## Run

    kotlin ScalarTypes.main.kts
