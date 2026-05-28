# 0008 — Strings

Given `name = "world"`, print a greeting, the name in uppercase, and its
length. Strings interpolate with `$name` (or `${...}` for expressions).
`.uppercase()` returns a new string (it replaced the deprecated
`.toUpperCase()`), and `.length` is a property.

## Run

    kotlinc Strings.kt -include-runtime -d strings.jar && java -jar strings.jar
