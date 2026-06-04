# 0330 — Lens Get/Set

Use a lens over the nested value {a:{b:1}} to get b (1) and to set b to 2, printing `1 2`. A `Lens` pairs a getter with an immutable setter that `copy`s the data classes.

## Run

    kotlinc LensGetSet.kt -include-runtime -d lensgetset.jar && java -jar lensgetset.jar
