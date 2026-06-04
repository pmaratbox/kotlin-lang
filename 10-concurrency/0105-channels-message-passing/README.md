# 0105 — Channels / Message Passing

Send the values 1, 2, 3 through a channel (or queue) from one thread and receive them in order, printing `1 2 3`. Kotlin uses Java's `LinkedBlockingQueue` as a thread-safe channel, with `put`/`take` for sending and receiving.

## Run

    kotlinc MessagePassing.kt -include-runtime -d messagepassing.jar && java -jar messagepassing.jar
