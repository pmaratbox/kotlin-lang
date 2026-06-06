# 0417 — BehaviorSubject

Implement a BehaviorSubject that holds a current value and replays it immediately to each new subscriber. Kotlin observers are modeled as `(Int) -> Unit` lambdas stored in a list.

## Run

    kotlinc BehaviorSubject.kt -include-runtime -d behaviorsubject.jar && java -jar behaviorsubject.jar
