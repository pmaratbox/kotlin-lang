# 0465 — Round trip

Use the real `jackson-module-kotlin` library to serialize a `Person(age, name)` to a compact JSON string with `ObjectMapper.writeValueAsString`, then deserialize that same string back into a `Person` with `readValue`, and print the recovered name.

## Run

    kotlin RoundTrip.main.kts
