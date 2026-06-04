# 0194 — Try / Catch / Finally

Throw and catch an error, printing `caught`, and always run a finally block printing `cleanup`, on two lines. Kotlin uses `try`/`catch`/`finally` like Java, where the `finally` block always runs.

## Run

    kotlinc CatchFinally.kt -include-runtime -d catchfinally.jar && java -jar catchfinally.jar
