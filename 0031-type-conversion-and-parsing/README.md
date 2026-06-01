# 0031 — Type Conversion & Parsing

Parse the string `"42"` into an integer and `"3.5"` into a float, then convert the integer back to a string, printing `int: 42`, `float: 3.5`, and `str: 42`. Kotlin extends `String` with `"42".toInt()` and `"3.5".toDouble()` (which throw on failure), plus `toIntOrNull()` variants that return `null` instead. `toString()` converts back.

## Run

    kotlinc Conversion.kt -include-runtime -d conversion.jar && java -jar conversion.jar
