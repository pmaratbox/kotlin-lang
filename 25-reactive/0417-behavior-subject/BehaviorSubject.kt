class BehaviorSubject(private var current: Int) {
    private val observers = mutableListOf<(Int) -> Unit>()

    fun subscribe(observer: (Int) -> Unit) {
        observers.add(observer)
        observer(current)
    }

    fun next(value: Int) {
        current = value
        for (observer in observers) observer(value)
    }
}

fun main() {
    val subject = BehaviorSubject(0)
    subject.subscribe { v -> println("A: $v") }
    subject.next(1)
    subject.subscribe { v -> println("B: $v") }
    subject.next(2)
}
