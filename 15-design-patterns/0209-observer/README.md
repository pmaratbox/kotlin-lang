# 0209 — Observer

Notify two observers of a new value 5; each prints its id and the value on its own line. The subject holds a `mutableListOf` observers and iterates with `forEach` on notify.

## Run

    kotlinc Observer.kt -include-runtime -d observer.jar && java -jar observer.jar
