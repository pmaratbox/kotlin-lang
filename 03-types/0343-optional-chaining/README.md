# 0343 — Optional Chaining

Read a deeply optional value a.b.c when present (5) and when absent (default 0), printing `5 0`. Safe-call `?.` short-circuits a null link and the Elvis `?:` supplies the fallback.

## Run

    kotlinc OptionalChaining.kt -include-runtime -d optionalchaining.jar && java -jar optionalchaining.jar
