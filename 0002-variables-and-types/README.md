# 0002 — Variables & basic types

Declare `val` bindings (immutable; `var` would be mutable) for Kotlin's four
basic types: `Int`, `Double`, `String`, `Boolean`. Type annotations are
optional — Kotlin would infer them — but shown here to make the types
explicit. `$var` inside double-quoted strings is a Kotlin string template.

## Run

    kotlinc Variables.kt -include-runtime -d variables.jar && java -jar variables.jar
