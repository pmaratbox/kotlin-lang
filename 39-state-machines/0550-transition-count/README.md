# 0550 — Transition count

Using the **Tinder StateMachine** library, we attach a per-transition action to a turnstile finite state machine. Each `transitionTo` rule emits a `SideEffect.Count`, and the machine's `onTransition` callback fires once per accepted transition; when it sees that side effect on a `Transition.Valid`, it increments a counter. After firing a fixed sequence of three valid events (`Coin`, `Push`, `Coin`), the counter — driven entirely by the FSM's transition callback rather than a hardcoded value — holds `3`.

## Run

    kotlin TransitionCount.main.kts
