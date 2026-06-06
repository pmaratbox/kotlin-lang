# 0424 — Signal + Computed

Implement fine-grained reactivity: a writable signal and a derived computed that recomputes when its dependency changes. Kotlin's `operator fun invoke()` lets a signal be read with call syntax like `a()`.

## Run

    kotlinc ReactiveSignalComputed.kt -include-runtime -d reactivesignalcomputed.jar && java -jar reactivesignalcomputed.jar
