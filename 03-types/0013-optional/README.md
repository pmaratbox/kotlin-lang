# 0013 — Optional

Hold one value that is present (`42`) and one that is absent, then print each
with a fallback of `-1` when absent. Nullability is in the type system: `Int?`
may hold `null`, and the Elvis operator `?:` supplies the fallback. A plain
`Int` could never be null.

## Run

    kotlinc Optionals.kt -include-runtime -d optional.jar && java -jar optional.jar
