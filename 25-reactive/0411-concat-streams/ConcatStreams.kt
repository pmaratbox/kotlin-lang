class Observer<T>(
    val next: (T) -> Unit,
    val complete: () -> Unit,
)

class Observable<T>(private val producer: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = producer(observer)
}

fun <T> of(vararg items: T): Observable<T> = Observable { observer ->
    for (item in items) observer.next(item)
    observer.complete()
}

fun <T> concat(a: Observable<T>, b: Observable<T>): Observable<T> = Observable { observer ->
    a.subscribe(Observer(
        next = { observer.next(it) },
        complete = {
            b.subscribe(Observer(
                next = { observer.next(it) },
                complete = { observer.complete() },
            ))
        },
    ))
}

fun main() {
    val a = of(1, 2)
    val b = of(3, 4)
    concat(a, b).subscribe(Observer(
        next = { println(it) },
        complete = {},
    ))
}
