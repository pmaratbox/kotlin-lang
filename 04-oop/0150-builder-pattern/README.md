# 0150 — Builder Pattern

Use a fluent builder to construct a Pizza of size M with cheese, and print `Pizza(M, cheese)`. Kotlin's `apply` returns `this`, letting each builder method chain fluently.

## Run

    kotlinc Pattern.kt -include-runtime -d pattern.jar && java -jar pattern.jar
