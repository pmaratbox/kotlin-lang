# 0113 — Result / Either Type

Model success and failure with a Result type: safeDiv(10,2) prints `ok: 5` and safeDiv(1,0) prints `err: divide by zero`. A Kotlin sealed class with Ok/Err subclasses is matched with `when`.

## Run

    kotlinc Type.kt -include-runtime -d type.jar && java -jar type.jar
