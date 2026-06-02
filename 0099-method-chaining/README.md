# 0099 — Method Chaining

Build a calculator that supports method chaining — start at `5`, then `.add(3).multiply(2)` — and print the result: `16`. Each method returns `this` to chain (Kotlin's `apply` scope function is another way to build fluent calls).

## Run

    kotlinc MethodChaining.kt -include-runtime -d chaining.jar && java -jar chaining.jar
