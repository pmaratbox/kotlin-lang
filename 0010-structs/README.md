# 0010 — Structs

Define a `Person` type with a `name` and an `age`, create one ("Ada", 36), and
print each field. A `data class` auto-generates `equals`, `hashCode`,
`toString`, and `copy`. Constructor parameters marked `val` become read-only
properties, read with dot access (`p.name`).

## Run

    kotlinc Structs.kt -include-runtime -d structs.jar && java -jar structs.jar
