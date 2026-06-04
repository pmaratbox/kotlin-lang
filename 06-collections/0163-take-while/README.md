# 0163 — Take While

From [1,2,3,4,1] take elements while they are < 3, printing `1 2`. `takeWhile` stops at the first element that fails the predicate.

## Run

    kotlinc While.kt -include-runtime -d while.jar && java -jar while.jar
