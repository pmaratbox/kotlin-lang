# 0054 — Resource Cleanup & Defer

Acquire a resource, use it, and let the language release it automatically at scope exit, printing `open`, `use`, and `close` in that order. `use` is an extension on `Closeable`/`AutoCloseable` that runs the block and then calls `close()`, even on an exception — Kotlin's try-with-resources.

## Run

    kotlinc ResourceCleanup.kt -include-runtime -d cleanup.jar && java -jar cleanup.jar
