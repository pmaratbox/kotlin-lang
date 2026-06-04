# 0120 — Append to a File

Write "a" to a file, append "b", then read both lines back and print `a b`. Kotlin's `appendText` opens the file in append mode without truncating it.

## Run

    kotlinc ToFile.kt -include-runtime -d tofile.jar && java -jar tofile.jar
