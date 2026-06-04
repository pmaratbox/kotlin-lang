# 0391 — URL Percent-Encode

Percent-encode the string "a b&c" to `a%20b%26c`. A `buildString` loop keeps unreserved chars and emits uppercase hex escapes for the rest.

## Run

    kotlinc UrlEncode.kt -include-runtime -d urlencode.jar && java -jar urlencode.jar
