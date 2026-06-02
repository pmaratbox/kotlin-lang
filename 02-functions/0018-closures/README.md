# 0018 — Closures

Build a counter that captures a private count starting at zero; each call to the returned function increments the count and returns it, so calling it twice prints 1 then 2. Where Java forbids it, Kotlin lets a lambda capture and reassign a `var` directly — the compiler boxes `count` behind the scenes into a mutable reference cell. The returned lambda has type `() -> Int`, and the last expression in its body is the return value.

## Run

    kotlinc Closures.kt -include-runtime -d closures.jar && java -jar closures.jar
