@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine
sealed class S { object Idle: S(); object Running: S() }
sealed class E { object Start: E(); object Reset: E() }
val sm = StateMachine.create<S, E, Any> {
    initialState(S.Idle)
    state<S.Idle> { on<E.Start> { transitionTo(S.Running) } }
    state<S.Running> { on<E.Reset> { transitionTo(S.Idle) } }
}
sm.transition(E.Start)
sm.transition(E.Reset)
println(sm.state::class.simpleName!!.lowercase())
