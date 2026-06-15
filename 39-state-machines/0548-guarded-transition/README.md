# 0548 — Guarded transition

Using the **Tinder StateMachine** library, we model a door FSM whose states (`Locked`, `Unlocked`, `Open`) and events (`Unlock`, `Open`) are sealed classes. The `Open` event is a *guarded transition*: an `on<E.Open>` rule is declared only inside the `state<S.Unlocked>` block, so the event is valid solely from `Unlocked` — the structure of the transition table itself enforces the guard. Starting in `Locked`, we fire `Unlock` then `Open`; the machine ends in `Open`, read back from `sm.state` and lowercased.

## Run

    kotlin GuardedTransition.main.kts
