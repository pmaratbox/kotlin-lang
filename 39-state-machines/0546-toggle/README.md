# 0546 — Toggle

A toggle is the simplest finite state machine: two states, `off` and `on`, with a single `toggle` event that flips between them. Built with Tinder's [StateMachine](https://github.com/Tinder/StateMachine) DSL, where states and events are sealed classes and each `state<S> { on<E> { transitionTo(...) } }` block declares a transition. Starting from `off`, firing `toggle` three times lands the machine in `on`.

## Run

    kotlin Toggle.main.kts
