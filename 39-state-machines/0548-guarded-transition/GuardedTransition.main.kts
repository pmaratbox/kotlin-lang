@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S { object Locked: S(); object Unlocked: S(); object Open: S() }
sealed class E { object Unlock: E(); object Open: E() }

val sm = StateMachine.create<S, E, Any> {
    initialState(S.Locked)
    state<S.Locked> { on<E.Unlock> { transitionTo(S.Unlocked) } }
    state<S.Unlocked> { on<E.Open> { transitionTo(S.Open) } }
    state<S.Open> {}
}

sm.transition(E.Unlock)
sm.transition(E.Open)
println(sm.state::class.simpleName!!.lowercase())
