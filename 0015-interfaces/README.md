# 0015 — Interfaces

Define a `Shape` interface with `name()` and `area()` methods, implement it for a rectangle and a square, then loop over a collection of shapes and print each one's area. Kotlin's `interface` declares the contract, and a class supplies it with a `: Shape` supertype plus the `override` keyword on each method (required, not optional, in Kotlin). The single-expression form `override fun area() = width * height` keeps each implementation to one line, and iterating a `List<Shape>` dispatches `s.area()` to the concrete class.

## Run

    kotlinc Interfaces.kt -include-runtime -d interfaces.jar && java -jar interfaces.jar
