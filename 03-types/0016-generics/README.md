# 0016 — Generics

Define a generic `first` function that returns the first element of a list, then call it on a list of integers and a list of strings to show one definition working at two types. Kotlin places the type parameter before the function name: `fun <T> first(items: List<T>): T`, and infers `T` at each call. Like Java it runs on the JVM with erasure, so `T` is compile-time only — though Kotlin adds `reified` type parameters on `inline` functions to recover the type at runtime when needed.

## Run

    kotlinc Generics.kt -include-runtime -d generics.jar && java -jar generics.jar
