# 0408 — Take Operator

Implement take(n) over an unbounded source of the natural numbers, emitting the first 3 then completing (and unsubscribing the source). The source loops while a captured `stopped` flag is false, and the unsubscribe closure flips it so the infinite loop exits idiomatically.

## Run

    kotlinc TakeOperator.kt -include-runtime -d takeoperator.jar && java -jar takeoperator.jar
