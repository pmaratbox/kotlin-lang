# 0027 — File I/O

Write `hello, file` to a file, read it back, delete the file, and print `read: hello, file`. Kotlin's `File` extension functions `writeText` and `readText` write and read the whole file in one call (UTF-8 by default), opening and closing the stream for you; `delete()` removes it. They wrap `java.io` under the hood.

## Run

    kotlinc FileIO.kt -include-runtime -d fileio.jar && java -jar fileio.jar
