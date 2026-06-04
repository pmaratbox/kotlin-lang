# 0389 — Hex Dump

Print the bytes of "Hi" as lowercase hex `48 69`. The `"%02x".format` formatter renders each byte as two lowercase hex digits.

## Run

    kotlinc HexDump.kt -include-runtime -d hexdump.jar && java -jar hexdump.jar
