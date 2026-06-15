# 0461 — Nested object

Serialize a `Person` whose `address` field is itself an `Address` object to compact JSON. Jackson's `jackson-module-kotlin` (`ObjectMapper().registerKotlinModule()`) walks the nested data classes recursively; declaring fields alphabetically yields keys in alphabetical order with no extra whitespace.

## Run

    kotlin NestedObject.main.kts
