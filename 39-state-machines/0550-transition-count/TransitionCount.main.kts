@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S { object Locked: S(); object Unlocked: S() }
sealed class E { object Coin: E(); object Push: E() }
sealed class SideEffect { object Count: SideEffect() }

var count = 0

val sm = StateMachine.create<S, E, SideEffect> {
    initialState(S.Locked)
    state<S.Locked> { on<E.Coin> { transitionTo(S.Unlocked, SideEffect.Count) } }
    state<S.Unlocked> { on<E.Push> { transitionTo(S.Locked, SideEffect.Count) } }
    onTransition {
        val valid = it as? StateMachine.Transition.Valid ?: return@onTransition
        if (valid.sideEffect == SideEffect.Count) count++
    }
}

sm.transition(E.Coin)   // Locked   -> Unlocked
sm.transition(E.Push)   // Unlocked -> Locked
sm.transition(E.Coin)   // Locked   -> Unlocked

println(count)
