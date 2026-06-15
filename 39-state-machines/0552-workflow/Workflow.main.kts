@file:DependsOn("com.tinder.statemachine:statemachine:0.2.0")
import com.tinder.StateMachine

sealed class S {
    object Idle : S()
    object Pending : S()
    object Approved : S()
}

sealed class E {
    object Submit : E()
    object Approve : E()
}

val sm = StateMachine.create<S, E, Any> {
    initialState(S.Idle)
    state<S.Idle> { on<E.Submit> { transitionTo(S.Pending) } }
    state<S.Pending> { on<E.Approve> { transitionTo(S.Approved) } }
    state<S.Approved> {}
}

sm.transition(E.Submit)
sm.transition(E.Approve)

println(sm.state::class.simpleName!!.lowercase())
