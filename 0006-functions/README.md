# 0006 — Functions

Define `add(a, b)` returning their sum, call it with `3` and `4`, and print
the result. Signature form is `fun name(params): ReturnType`. Unlike Java,
Kotlin functions can live at the top level (no enclosing class needed). The
single-expression form is more concise: `fun add(a: Int, b: Int) = a + b`.

## Run

    kotlinc Functions.kt -include-runtime -d functions.jar && java -jar functions.jar
