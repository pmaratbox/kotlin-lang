# 0260 — Pack and Unpack Bits

Pack r=1,g=2,b=3 into one integer (8 bits each) then unpack them, printing `1 2 3`. Shifts with `shl` pack the channels and `shr` with `and 0xff` recovers each one.

## Run

    kotlinc PackUnpackBits.kt -include-runtime -d packunpackbits.jar && java -jar packunpackbits.jar
