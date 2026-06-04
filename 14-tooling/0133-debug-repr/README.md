# 0133 — Debug Representation

Produce a debug/structured representation of a Point(1,2) and print `Point(x=1, y=2)`. A `data class` auto-derives a `toString` that yields exactly that form.

## Run

    kotlinc Repr.kt -include-runtime -d repr.jar && java -jar repr.jar
