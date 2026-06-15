@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S { object Red: S(); object Green: S(); object Yellow: S() }
sealed class E { object Next: E() }

val sm = StateMachine.create<S, E, Any> {
    initialState(S.Red)
    state<S.Red> { on<E.Next> { transitionTo(S.Green) } }
    state<S.Green> { on<E.Next> { transitionTo(S.Yellow) } }
    state<S.Yellow> { on<E.Next> { transitionTo(S.Red) } }
}

sm.transition(E.Next)
sm.transition(E.Next)
println(sm.state::class.simpleName!!.lowercase())
