# 0021 — Mutability & References

Have a function increment a value in place — through a pointer, reference, or mutable holder — so the caller sees it change from `before: 1` to `after: 2`. Like Java, Kotlin passes references by value; the `IntArray` is shared, so `box[0]++` is visible to the caller. Parameters are `val` (immutable bindings) and can't be reassigned, reinforcing that you mutate the *object*, not the binding.

## Run

    kotlinc References.kt -include-runtime -d references.jar && java -jar references.jar
