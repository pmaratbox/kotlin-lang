class Observer<T>(
    val next: (T) -> Unit,
    val complete: () -> Unit = {},
)

class Observable<T>(private val subscribeFn: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = subscribeFn(observer)
}

fun <T, R> map(source: Observable<T>, f: (T) -> R): Observable<R> =
    Observable { downstream ->
        source.subscribe(
            Observer(
                next = { value -> downstream.next(f(value)) },
                complete = { downstream.complete() },
            ),
        )
    }

fun main() {
    val source = Observable<Int> { observer ->
        for (value in listOf(1, 2, 3, 4)) observer.next(value)
        observer.complete()
    }

    val doubled = map(source) { it * 2 }
    doubled.subscribe(Observer(next = { println(it) }))
}
