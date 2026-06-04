# 0270 — Elevator FSM

Move an elevator from floor 0 up to floor 2 then back to 0, printing every floor it stops at `0 1 2 1 0`. A signed step toward each target accumulates floors into a Kotlin `mutableListOf`.

## Run

    kotlinc ElevatorFsm.kt -include-runtime -d elevatorfsm.jar && java -jar elevatorfsm.jar
