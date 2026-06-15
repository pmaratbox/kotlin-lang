# 0460 — Deserialize an object

Parse the compact JSON string `{"age":30,"name":"alice"}` into a typed `Person` data class using the real `jackson-module-kotlin` library: `ObjectMapper().registerKotlinModule()` plus the `readValue` extension binds the JSON object onto the Kotlin constructor parameters. Then print `name age`.

## Run

    kotlin DeserializeObject.main.kts
