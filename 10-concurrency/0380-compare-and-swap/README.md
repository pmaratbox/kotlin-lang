# 0380 — Compare-And-Swap Loop

Increment a shared value to 100 using a CAS retry loop from multiple threads, printing `100`. Kotlin uses `AtomicInteger.compareAndSet`, retrying in a loop until the swap from the observed value succeeds.

## Run

    kotlinc CompareAndSwap.kt -include-runtime -d compareandswap.jar && java -jar compareandswap.jar
