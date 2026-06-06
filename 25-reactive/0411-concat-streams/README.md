# 0411 — Concat Streams

Implement concat: subscribe to the second source only after the first completes; concat [1,2] then [3,4]. In Kotlin, the observer is a small class of `next`/`complete` lambdas and `concat` chains subscriptions synchronously.

## Run

    kotlinc ConcatStreams.kt -include-runtime -d concatstreams.jar && java -jar concatstreams.jar
