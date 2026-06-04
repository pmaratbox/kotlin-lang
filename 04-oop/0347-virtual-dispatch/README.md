# 0347 — Virtual Dispatch

Store a Circle, Square, and Triangle in one Shape collection and call describe() on each, printing `circle square triangle`. Kotlin resolves the overridden describe() at runtime via the abstract base type.

## Run

    kotlinc VirtualDispatch.kt -include-runtime -d virtualdispatch.jar && java -jar virtualdispatch.jar
