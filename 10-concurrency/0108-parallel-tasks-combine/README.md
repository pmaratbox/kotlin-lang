# 0108 — Parallel Tasks Combined

Run two independent tasks that produce 10 and 20 concurrently, then combine (sum) their results into `30`. Kotlin uses Java's `CompletableFuture.supplyAsync` and `thenCombine` to run and merge the two results.

## Run

    kotlinc TasksCombine.kt -include-runtime -d taskscombine.jar && java -jar taskscombine.jar
