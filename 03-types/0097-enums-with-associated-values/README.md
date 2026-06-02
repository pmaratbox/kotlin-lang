# 0097 — Enums with Associated Values

Define a shape type carrying associated data — `Rect(2, 3)` and `Square(4)` — compute each area by matching on the variant, and print `6` and `16`. A `sealed class` with `data class` variants is the sum type; `when` with `is` checks smart-casts to each variant's fields, and the compiler knows the cases are exhaustive.

## Run

    kotlinc EnumAssociated.kt -include-runtime -d shapes.jar && java -jar shapes.jar
