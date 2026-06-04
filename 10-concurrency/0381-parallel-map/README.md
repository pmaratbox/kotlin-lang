# 0381 — Parallel Map

Square 1,2,3,4 in parallel and collect the results in input order, printing `1 4 9 16`. Kotlin launches one `CompletableFuture.supplyAsync` per element, then reassembles by mapping the futures back in their original order.

## Run

    kotlinc ParallelMap.kt -include-runtime -d parallelmap.jar && java -jar parallelmap.jar
