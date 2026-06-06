// A minimal push-based Observable implemented from scratch.
class Observer<T>(val next: (T) -> Unit, val complete: () -> Unit = {})

class Observable<T>(private val subscribeFn: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = subscribeFn(observer)
}

fun <T> of(vararg items: T): Observable<T> = Observable { obs ->
    for (item in items) obs.next(item)
    obs.complete()
}

// scan: emit the running accumulation, seeded with acc.
fun <T, R> scan(source: Observable<T>, acc: R, f: (R, T) -> R): Observable<R> =
    Observable { obs ->
        var state = acc
        source.subscribe(Observer(
            next = { value ->
                state = f(state, value)
                obs.next(state)
            },
            complete = { obs.complete() }
        ))
    }

fun main() {
    val source = of(1, 2, 3, 4)
    val sums = scan(source, 0) { state, value -> state + value }
    sums.subscribe(Observer(next = { println(it) }))
}
