# 0011 — Error Handling

Write a `divide(a, b)` that throws on a zero divisor, then call it on `10 / 2`
(prints the result) and `10 / 0` (prints an error). Kotlin uses **exceptions**
(`throw` / `try` / `catch`) like Java; `e.message` is the text. Kotlin also
offers `runCatching { ... }` returning a `Result<T>` for a functional style.

## Run

    kotlinc ErrorHandling.kt -include-runtime -d errorhandling.jar && java -jar errorhandling.jar
