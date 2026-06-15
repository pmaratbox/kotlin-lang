# 0547 — Traffic light

Using the **Tinder StateMachine** library, we model a traffic-light finite state machine whose states (`Red`, `Green`, `Yellow`) and the single `Next` event are sealed classes. `StateMachine.create` declares the initial state (`Red`) plus a `transitionTo` rule for each `on<Next>` in each `state` block, forming the cycle red → green → yellow → red. Firing `Next` twice with `sm.transition` advances the machine from `Red` to `Green` to `Yellow`; the resulting state is read back from `sm.state` and lowercased.

## Run

    kotlin TrafficLight.main.kts
