# 0234 — Parse Number Bases

Parse "ff" as hexadecimal (255) and "101" as binary (5), printing `255 5`. Kotlin's `String.toInt(radix)` converts each digit string in its base.

## Run

    kotlinc NumberBaseParse.kt -include-runtime -d numberbaseparse.jar && java -jar numberbaseparse.jar
