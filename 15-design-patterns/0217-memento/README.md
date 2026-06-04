# 0217 — Memento

Save state 1, change it to 2, then restore from the memento, printing current then restored `2 1`. The originator captures its state into an immutable `Memento` and restores from it.

## Run

    kotlinc Memento.kt -include-runtime -d memento.jar && java -jar memento.jar
