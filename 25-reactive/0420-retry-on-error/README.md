# 0420 — Retry On Error

Implement retry(n) that resubscribes to the source on error up to n times; the source succeeds on the 3rd subscription. In Kotlin a local recursive `attempt` function wired into a fresh anonymous `Observer` cleanly re-runs the producer.

## Run

    kotlinc RetryOnError.kt -include-runtime -d retryonerror.jar && java -jar retryonerror.jar
