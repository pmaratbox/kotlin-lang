# 0377 — Permission Bits

Decode the Unix permission bits 0b101 into the rwx string `r-x`. Kotlin's `and` infix bitwise operator tests each permission bit.

## Run

    kotlinc PermissionBits.kt -include-runtime -d permissionbits.jar && java -jar permissionbits.jar
