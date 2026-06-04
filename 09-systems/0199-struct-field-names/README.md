# 0199 — Struct Field Names

List the field names of a Point{x,y} struct/record and print `x y`. Kotlin reflection reads the data class's `primaryConstructor` parameters, preserving declaration order.

## Run

    kotlinc FieldNames.kt -include-runtime -d fieldnames.jar && java -jar fieldnames.jar
