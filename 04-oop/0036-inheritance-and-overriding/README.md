# 0036 — Inheritance & Overriding

Define a base `Animal` with a `speak` method, a `Dog` that overrides it, and call both, printing `animal: some sound` and `dog: Woof`. Classes and methods are `final` by default, so the base is marked `open` (both class and method) to let `Dog` `override` `speak`. This makes inheritance explicit and opt-in, unlike Java.

## Run

    kotlinc Inheritance.kt -include-runtime -d inheritance.jar && java -jar inheritance.jar
