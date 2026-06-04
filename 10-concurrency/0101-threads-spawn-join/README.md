# 0101 — Threads: Spawn and Join

Spawn 3 worker threads, wait for all of them to finish, then print `done: 3`. Kotlin's `kotlin.concurrent.thread` builder starts a `Thread`, and `join()` blocks until it completes.

## Run

    kotlinc SpawnJoin.kt -include-runtime -d spawnjoin.jar && java -jar spawnjoin.jar
