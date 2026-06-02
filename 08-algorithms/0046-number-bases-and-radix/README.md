# 0046 — Number Bases & Radix

Print the integer `255` in hexadecimal, octal, and binary, producing `hex: ff`, `oct: 377`, and `bin: 11111111`. `Int.toString(radix)` renders the number in any base from 2 to 36, so radix 16, 8, and 2 give hex, octal, and binary. `Integer.toBinaryString` from Java is also available.

## Run

    kotlinc NumberBases.kt -include-runtime -d bases.jar && java -jar bases.jar
