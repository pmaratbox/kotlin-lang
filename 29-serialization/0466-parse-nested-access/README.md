# 0466 — Parse & access nested

Parse a JSON string with Jackson's `jackson-module-kotlin` using the dynamic tree API: `ObjectMapper.readTree` returns a `JsonNode` that we walk with `path(...)` and `get(index)` to reach a deeply nested value, then print `user.name` and the first role.

## Run

    kotlin ParseNestedAccess.main.kts
