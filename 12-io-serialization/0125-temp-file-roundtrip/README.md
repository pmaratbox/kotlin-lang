# 0125 — Temp File Roundtrip

Write a string to a temporary file, read it back, confirm it matches, delete the file, and print `roundtrip: ok`. Kotlin uses `File.createTempFile` plus `writeText`/`readText` for the roundtrip.

## Run

    kotlinc FileRoundtrip.kt -include-runtime -d fileroundtrip.jar && java -jar fileroundtrip.jar
