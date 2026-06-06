// A push-based Observable implemented from scratch.
// An Observer receives next/error/complete; subscribe wires a producer to it
// and returns an unsubscribe handle the operator can use to stop the source.

class Observer<T>(
    val next: (T) -> Unit,
    val complete: () -> Unit = {},
    val error: (Throwable) -> Unit = {},
)

// An Observable is just a subscribe function returning an unsubscribe handle.
class Observable<T>(val subscribe: (Observer<T>) -> () -> Unit)

// Unbounded source of the natural numbers 1, 2, 3, ...
// It checks a "stopped" flag so it stops being driven once unsubscribed.
fun naturals(): Observable<Int> = Observable { observer ->
    var stopped = false
    var n = 1
    while (!stopped) {
        observer.next(n)
        n++
    }
    return@Observable { stopped = true }
}

// take(n): forward the first n emissions, then complete and unsubscribe the source.
fun <T> take(source: Observable<T>, n: Int): Observable<T> = Observable { observer ->
    var count = 0
    var unsubscribe: (() -> Unit)? = null
    var done = false
    unsubscribe = source.subscribe(
        Observer(
            next = { value ->
                if (!done) {
                    if (count < n) {
                        observer.next(value)
                        count++
                    }
                    if (count >= n) {
                        done = true
                        observer.complete()
                        unsubscribe?.invoke()
                    }
                }
            },
            complete = { if (!done) { done = true; observer.complete() } },
        )
    )
    return@Observable { done = true; unsubscribe?.invoke() }
}

fun main() {
    take(naturals(), 3).subscribe(
        Observer(
            next = { println(it) },
            complete = { println("completed") },
        )
    )
}
