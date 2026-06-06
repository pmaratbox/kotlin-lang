class Observer(val next: (Int) -> Unit, val complete: () -> Unit)

class Observable(private val producer: (Observer) -> Unit) {
    fun subscribe(observer: Observer) = producer(observer)
}

fun main() {
    val source = Observable { observer ->
        observer.next(1)
        observer.next(2)
        observer.next(3)
        observer.complete()
    }

    source.subscribe(Observer(
        next = { value -> println(value) },
        complete = { println("done") }
    ))
}
