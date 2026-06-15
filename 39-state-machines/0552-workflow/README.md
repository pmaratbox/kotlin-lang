# 0552 — Workflow

Using the **Tinder StateMachine** library, we model a multi-step approval workflow as a finite state machine. We declare `idle`, `pending`, and `approved` as sealed-class states and `submit`/`approve` as events, then register transitions (`idle --submit--> pending`, `pending --approve--> approved`). Firing the fixed sequence `submit` then `approve` drives the machine to its final state, whose name we read back from the machine and print lowercased.

## Run

    kotlin Workflow.main.kts
