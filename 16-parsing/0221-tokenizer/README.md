# 0221 — Tokenizer

Tokenize the expression "1 + 2" into token types, printing `NUM PLUS NUM`. A `when` over each character maps digits and `+` to token-type names.

## Run

    kotlinc Tokenizer.kt -include-runtime -d tokenizer.jar && java -jar tokenizer.jar
