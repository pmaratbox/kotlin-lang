# 0033 — Custom Error Types

Define a custom error, raise it from a `check` that rejects values over `100`, catch it for the input `200`, and print `error: value too large`. A custom exception extends `Exception`, passing its message to the superclass constructor; `throw`/`try`/`catch` mirror Java, but all Kotlin exceptions are unchecked, so `check` needs no `throws` clause.

## Run

    kotlinc CustomErrors.kt -include-runtime -d errors.jar && java -jar errors.jar
