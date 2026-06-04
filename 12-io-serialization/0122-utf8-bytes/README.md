# 0122 — UTF-8 Bytes

Print the UTF-8 byte values of "Hi": `72 105`. Kotlin's `toByteArray(Charsets.UTF_8)` yields the encoded bytes, masked with `0xFF` to read them unsigned.

## Run

    kotlinc Bytes.kt -include-runtime -d bytes.jar && java -jar bytes.jar
