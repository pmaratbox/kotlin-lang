# 0268 — Cellular Automaton Rule 90

Apply one Rule 90 step (new = left XOR right) to the row "00100" with zero boundaries, printing `01010`. Each cell maps over `indices` using Kotlin's infix `xor` with zeroed edges.

## Run

    kotlinc Rule90Step.kt -include-runtime -d rule90step.jar && java -jar rule90step.jar
