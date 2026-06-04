# 0352 — ROT13

Apply ROT13 to "hello" (->"uryyb") and ROT13 again to recover "hello", printing `uryyb hello`. Rotate each letter by 13 within its case using modular arithmetic on the `Char` code.

## Run

    kotlinc Rot13.kt -include-runtime -d rot13.jar && java -jar rot13.jar
