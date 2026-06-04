# 0397 — Log Level Filter

With a threshold of WARN, log messages at INFO, WARN, and ERROR but only emit WARN and ERROR, on two lines. An `enum class` gives a natural ordinal ordering for the `>=` comparison.

## Run

    kotlinc LogLevels.kt -include-runtime -d loglevels.jar && java -jar loglevels.jar
