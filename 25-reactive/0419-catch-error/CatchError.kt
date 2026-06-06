class Observer<T>(
    val next: (T) -> Unit,
    val error: (Throwable) -> Unit = {},
    val complete: () -> Unit = {},
)

class Observable<T>(val subscribe: (Observer<T>) -> Unit)

fun <T> catchError(source: Observable<T>, fallback: Observable<T>): Observable<T> =
    Observable { observer ->
        source.subscribe(
            Observer(
                next = observer.next,
                error = { fallback.subscribe(observer) },
                complete = observer.complete,
            )
        )
    }

fun main() {
    val source = Observable<Int> { o ->
        o.next(1)
        o.next(2)
        o.error(RuntimeException("boom"))
    }
    val fallback = Observable<Int> { o ->
        o.next(9)
        o.complete()
    }
    catchError(source, fallback).subscribe(Observer(next = { println(it) }))
}
