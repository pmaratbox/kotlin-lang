@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S { object Off : S(); object On : S() }
sealed class E { object Toggle : E() }

val sm = StateMachine.create<S, E, Any> {
    initialState(S.Off)
    state<S.Off> { on<E.Toggle> { transitionTo(S.On) } }
    state<S.On> { on<E.Toggle> { transitionTo(S.Off) } }
}

sm.transition(E.Toggle) // off -> on
sm.transition(E.Toggle) // on -> off
sm.transition(E.Toggle) // off -> on

println(sm.state::class.simpleName!!.lowercase())
