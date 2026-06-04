# 0375 — Retry With Attempts

Retry an operation that fails on attempts 1 and 2 and succeeds on attempt 3, printing `ok after 3`. A `for` range loop drives the attempts and `break` stops on success.

## Run

    kotlinc RetryLogic.kt -include-runtime -d retrylogic.jar && java -jar retrylogic.jar
