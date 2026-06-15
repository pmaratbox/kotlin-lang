@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S { object Locked: S(); object Unlocked: S() }
sealed class E { object Coin: E(); object Push: E() }

val sm = StateMachine.create<S, E, Any> {
    initialState(S.Locked)
    state<S.Locked> { on<E.Coin> { transitionTo(S.Unlocked) } }
    state<S.Unlocked> { on<E.Push> { transitionTo(S.Locked) } }
}

sm.transition(E.Coin)
println(sm.state::class.simpleName!!.lowercase())
