# 0111 — Partial Application

Partially apply a two-argument add by fixing the first argument to 10, then call the result with 3 to print `13`. A Kotlin lambda binds one argument, leaving a one-arg function.

## Run

    kotlinc Application.kt -include-runtime -d application.jar && java -jar application.jar
