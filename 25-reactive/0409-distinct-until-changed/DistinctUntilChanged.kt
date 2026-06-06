// A tiny push-based Observable implemented from scratch.
class Observer<T>(
    val next: (T) -> Unit,
    val complete: () -> Unit = {},
)

class Observable<T>(private val subscribe: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = subscribe.invoke(observer)

    fun distinctUntilChanged(): Observable<T> = Observable { observer ->
        var hasLast = false
        var last: T? = null
        subscribe(Observer(
            next = { value ->
                if (!hasLast || value != last) {
                    hasLast = true
                    last = value
                    observer.next(value)
                }
            },
            complete = observer.complete,
        ))
    }

    companion object {
        fun <T> of(vararg values: T): Observable<T> = Observable { observer ->
            for (v in values) observer.next(v)
            observer.complete()
        }
    }
}

fun main() {
    Observable.of(1, 1, 2, 2, 2, 3, 1)
        .distinctUntilChanged()
        .subscribe(Observer(next = { println(it) }))
}
