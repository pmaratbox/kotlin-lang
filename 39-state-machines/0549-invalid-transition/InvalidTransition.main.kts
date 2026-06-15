@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S { object Locked: S(); object Unlocked: S() }
sealed class E { object Coin: E(); object Push: E() }

val sm = StateMachine.create<S, E, Any> {
    initialState(S.Locked)
    state<S.Locked> { on<E.Coin> { transitionTo(S.Unlocked) } }
    state<S.Unlocked> { on<E.Push> { transitionTo(S.Locked) } }
}

// 'Push' has no transition defined from 'Locked'. The machine reports an
// invalid transition and leaves its state unchanged (no crash).
sm.transition(E.Push)
println(sm.state::class.simpleName!!.lowercase())
