# 0264 — Turnstile FSM

Drive a turnstile (locked/unlocked) with events coin, push, push and print the resulting states `unlocked locked locked`. A `(state to event)` pair keys the transition map in Kotlin.

## Run

    kotlinc TurnstileFsm.kt -include-runtime -d turnstilefsm.jar && java -jar turnstilefsm.jar
