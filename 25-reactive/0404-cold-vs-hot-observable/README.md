# 0404 — Cold vs Hot Observable

Contrast a cold observable (re-runs its producer per subscriber) with a hot one (shares a single execution, so late subscribers miss earlier values). In Kotlin each observer is a small class wrapping an `(Int) -> Unit` lambda, and subscribers collect into a `mutableListOf<Int>()`.

## Run

    kotlinc ColdVsHotObservable.kt -include-runtime -d coldvshotobservable.jar && java -jar coldvshotobservable.jar
