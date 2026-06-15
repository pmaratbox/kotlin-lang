# 0464 — Optional field default

Parse JSON that is missing the `age` field into a `Person` data class using the real `jackson-module-kotlin` library. Because `age` has a Kotlin default value (`= 0`), the Kotlin module supplies that default when the key is absent from the JSON, so `{"name":"alice"}` deserializes to `Person(age=0, name="alice")`.

## Run

    kotlin OptionalDefault.main.kts
