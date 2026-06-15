# 0462 — Array of objects

Serializes a `List<Person>` to a compact JSON array using the real Jackson `jackson-module-kotlin` library. An `ObjectMapper().registerKotlinModule()` turns the Kotlin `data class` list into JSON via `writeValueAsString`. Declaring the `Person` fields alphabetically (`age`, then `name`) makes the emitted keys alphabetical, and Jackson's default output is compact (no spaces).

## Run

    kotlin ArrayOfObjects.main.kts
