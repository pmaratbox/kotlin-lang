# 0001 — Hello, world!

The minimal Kotlin program: a top-level `main` function. No enclosing class is
required — the compiler synthesizes one named `HelloWorldKt` from the file name.

## Run

    kotlinc HelloWorld.kt -include-runtime -d hello.jar && java -jar hello.jar
