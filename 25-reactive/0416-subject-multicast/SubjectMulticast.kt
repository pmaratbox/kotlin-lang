class Subject<T> {
    private val observers = mutableListOf<(T) -> Unit>()

    fun subscribe(observer: (T) -> Unit) {
        observers.add(observer)
    }

    fun next(value: T) {
        for (observer in observers) observer(value)
    }
}

fun main() {
    val subject = Subject<Int>()
    subject.subscribe { v -> println("obs1: $v") }
    subject.subscribe { v -> println("obs2: $v") }
    subject.next(1)
    subject.next(2)
}
