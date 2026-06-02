# 0088 — String Builder

Use a string builder to assemble `1`, `2`, and `3` joined by `-`, printing `1-2-3`. `buildString { ... }` provides a `StringBuilder` receiver and returns its final string — Kotlin's builder idiom.

## Run

    kotlinc StringBuilderDemo.kt -include-runtime -d stringbuilder.jar && java -jar stringbuilder.jar
