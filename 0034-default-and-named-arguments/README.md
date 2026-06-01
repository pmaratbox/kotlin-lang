# 0034 — Default & Named Arguments

Give a `greet` function a default greeting, then call it once without the greeting and once overriding it, printing `Hello, Ada` and `Hi, Ada`. Kotlin has both: a default value (`greeting: String = "Hello"`) and named arguments (`greeting = "Hi"`). Naming arguments also lets callers reorder them and skip over earlier defaults.

## Run

    kotlinc DefaultArgs.kt -include-runtime -d defaults.jar && java -jar defaults.jar
