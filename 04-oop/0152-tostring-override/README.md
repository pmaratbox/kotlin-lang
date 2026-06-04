# 0152 — toString Override

Override the string conversion of a Point(1,2) so it prints `Point(1, 2)`. Kotlin's `override fun toString()` customizes how `println` renders the object.

## Run

    kotlinc Override.kt -include-runtime -d override.jar && java -jar override.jar
