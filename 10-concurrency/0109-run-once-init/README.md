# 0109 — Run-Once Initialization

Ensure an initializer runs exactly once even when several threads race to trigger it, printing `init count: 1`. Kotlin's `by lazy { ... }` defaults to `SYNCHRONIZED` mode, so the initializer body runs at most once across all threads.

## Run

    kotlinc OnceInit.kt -include-runtime -d onceinit.jar && java -jar onceinit.jar
