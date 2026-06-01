# 0038 — String Methods

Split `"a,b,c"` on commas, upper-case each part, and join them with `-`, printing `A-B-C`. `split(",")` returns a `List<String>`, and `joinToString("-") { it.uppercase() }` both transforms and joins in one call. Kotlin's `split` takes a plain delimiter, unlike Java's regex-based one.

## Run

    kotlinc StringMethods.kt -include-runtime -d strmethods.jar && java -jar strmethods.jar
