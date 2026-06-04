# 0261 — Rotate Left (8-bit)

Rotate the 8-bit value 1 left by 1 (->2) and 128 left by 1 (->1), printing `2 1`. A single-expression `rol8` combines `shl`/`shr` and masks with `and 0xff`.

## Run

    kotlinc RotateLeft.kt -include-runtime -d rotateleft.jar && java -jar rotateleft.jar
