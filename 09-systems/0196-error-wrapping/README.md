# 0196 — Error Wrapping

Wrap an inner error "inner" inside an outer context and print the combined message `outer: inner`. Kotlin wraps exceptions via the `cause` constructor argument, reachable through the `cause` property.

## Run

    kotlinc Wrapping.kt -include-runtime -d wrapping.jar && java -jar wrapping.jar
