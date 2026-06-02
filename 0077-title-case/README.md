# 0077 — Title Case

Convert `hello world` to title case (uppercase the first letter of each word) and print it: `Hello World`. `replaceFirstChar { it.uppercase() }` uppercases each word's first character (the modern replacement for the deprecated `capitalize()`).

## Run

    kotlinc TitleCase.kt -include-runtime -d titlecase.jar && java -jar titlecase.jar
