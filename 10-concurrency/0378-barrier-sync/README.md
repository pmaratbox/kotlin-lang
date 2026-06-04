# 0378 — Barrier Synchronization

Have 3 threads each arrive at a barrier before any proceeds, then print `all reached: 3`. Kotlin uses Java's `CyclicBarrier`, whose `await()` blocks until all parties have arrived.

## Run

    kotlinc BarrierSync.kt -include-runtime -d barriersync.jar && java -jar barriersync.jar
