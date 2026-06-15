# 0551 — Reset

Using the **Tinder StateMachine** library, we declare a finite state machine over the sealed `S` states (`Idle`, `Running`) and sealed `E` events (`Start`, `Reset`). The machine starts in `Idle`, transitions to `Running` on `Start`, and the `Reset` event returns it to the initial `Idle` state. We fire `Start` then `Reset` and print the resulting state name lowercased.

## Run

    kotlin Reset.main.kts
