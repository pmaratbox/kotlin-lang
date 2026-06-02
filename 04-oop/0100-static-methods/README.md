# 0100 — Static Methods

Define a static (class-level) method `square` that needs no instance, call it as `square(6)`, and print `36`. Kotlin has no `static`; a `companion object` holds class-level functions, called as `MathUtil.square(...)`.

## Run

    kotlinc StaticMethods.kt -include-runtime -d staticmethods.jar && java -jar staticmethods.jar
