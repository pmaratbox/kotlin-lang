# 0379 — Future Chain

Chain asynchronous steps 5 -> (*2) -> (+1) and print the final value `11`. Kotlin composes `CompletableFuture` stages with `thenApply`, transforming the result of each prior stage.

## Run

    kotlinc FutureChain.kt -include-runtime -d futurechain.jar && java -jar futurechain.jar
