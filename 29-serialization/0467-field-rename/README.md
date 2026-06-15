# 0467 — Field rename

Serialize a Kotlin data class with `jackson-module-kotlin`, using Jackson's `@JsonProperty` annotation to rename the `fullName` field to the JSON key `full_name`. Serializing `Person("alice")` yields `{"full_name":"alice"}`.

## Run

    kotlin FieldRename.main.kts
