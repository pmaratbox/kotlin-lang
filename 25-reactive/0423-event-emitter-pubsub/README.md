# 0423 — EventEmitter (Pub/Sub)

Build a multi-topic EventEmitter with on(topic, handler), emit(topic, payload), and off(topic, handler). Kotlin stores handlers as `(String) -> Unit` function references in a `mutableMapOf`, so `off` can remove the exact lambda value.

## Run

    kotlinc EventEmitterPubsub.kt -include-runtime -d eventemitterpubsub.jar && java -jar eventemitterpubsub.jar
