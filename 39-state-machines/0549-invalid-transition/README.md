# 0549 — Invalid transition

Using the **Tinder StateMachine** library, we define the turnstile finite state machine whose states (`Locked`, `Unlocked`) and events (`Coin`, `Push`) are modeled as sealed classes. Only `Locked → Coin → Unlocked` and `Unlocked → Push → Locked` are declared. Firing `Push` while in `Locked` is an *invalid transition*: the library has no matching `on<Push>` rule for that state, so `sm.transition` returns a `Transition.Invalid` result and leaves `sm.state` unchanged rather than throwing. The machine therefore stays in `Locked`, which we read back from `sm.state` and lowercase.

## Run

    kotlin InvalidTransition.main.kts
