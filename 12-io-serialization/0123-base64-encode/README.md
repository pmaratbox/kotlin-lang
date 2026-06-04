# 0123 — Base64 Encode

Base64-encode the bytes of "hi" to get `aGk=`. Kotlin reuses the JDK's `java.util.Base64` encoder.

## Run

    kotlinc Encode.kt -include-runtime -d encode.jar && java -jar encode.jar
