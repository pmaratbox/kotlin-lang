class Observer<T>(
    val next: (T) -> Unit,
    val error: (Throwable) -> Unit = {},
    val complete: () -> Unit = {}
)

typealias Observable<T> = (Observer<T>) -> Unit

fun <T> filter(source: Observable<T>, pred: (T) -> Boolean): Observable<T> = { obs ->
    source(Observer(
        next = { value -> if (pred(value)) obs.next(value) },
        error = obs.error,
        complete = obs.complete
    ))
}

fun main() {
    val source: Observable<Int> = { obs ->
        for (n in 1..6) obs.next(n)
        obs.complete()
    }

    val evens = filter(source) { it % 2 == 0 }

    evens(Observer(next = { println(it) }))
}
