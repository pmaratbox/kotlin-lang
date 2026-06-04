# 0144 — Flag Enum (Bit Flags)

Combine bit flags READ(1) and WRITE(2) into 3, check that WRITE is set, and print `3 yes`. Kotlin spells bitwise operations as infix functions `or` and `and` on `Int`.

## Run

    kotlinc Enum.kt -include-runtime -d enum.jar && java -jar enum.jar
