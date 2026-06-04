# 0269 — Deterministic Transition Walk

Walk a deterministic transition map A->B->C->A for three steps from A, printing the visited states `B C A`. A `mapOf` next-state lookup advances the walk in Kotlin.

## Run

    kotlinc MarkovDeterministic.kt -include-runtime -d markovdeterministic.jar && java -jar markovdeterministic.jar
