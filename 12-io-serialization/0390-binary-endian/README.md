# 0390 — Big-Endian Bytes

Encode the integer 258 as two big-endian bytes (1, 2), decode them back to 258, printing `1 2 258`. Kotlin's `shr` and `and` bit operators split and recombine the byte pair.

## Run

    kotlinc BinaryEndian.kt -include-runtime -d binaryendian.jar && java -jar binaryendian.jar
