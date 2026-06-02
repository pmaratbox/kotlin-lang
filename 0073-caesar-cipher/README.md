# 0073 — Caesar Cipher

Encrypt `abc` with a Caesar cipher shifting each letter forward by `1` (wrapping within the alphabet) and print the result: `bcd`. `ch - 'a'` is an `Int`; adding the wrapped offset back to the `Char` `'a'` yields the shifted `Char`.

## Run

    kotlinc CaesarCipher.kt -include-runtime -d caesar.jar && java -jar caesar.jar
