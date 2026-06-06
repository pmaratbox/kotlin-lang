# 0415 — SwitchMap

Implement switchMap: when a new outer value arrives, cancel the previous inner subscription before starting the new one. Each subscribe returns a cancel lambda over the scheduler's cancel tokens, so switching just invokes the prior inner's cancel.

## Run

    kotlinc SwitchMap.kt -include-runtime -d switchmap.jar && java -jar switchmap.jar
