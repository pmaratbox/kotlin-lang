# 0545 — Basic transition

Using the **Tinder StateMachine** library, we define a turnstile finite state machine whose states (`Locked`, `Unlocked`) and events (`Coin`, `Push`) are modeled as sealed classes. `StateMachine.create` declares the initial state plus a `transitionTo` rule for each `on<Event>` in each `state` block. Firing the single `Coin` event with `sm.transition` advances the machine from `Locked` to `Unlocked`; the resulting state is read back from `sm.state` and lowercased.

## Run

    kotlin BasicTransition.main.kts
