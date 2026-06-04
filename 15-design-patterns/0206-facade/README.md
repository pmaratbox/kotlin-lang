# 0206 — Facade

Expose a single facade call that starts three subsystems and reports `ready`. The facade hides the three subsystem objects behind one idiomatic `start()` method.

## Run

    kotlinc Facade.kt -include-runtime -d facade.jar && java -jar facade.jar
