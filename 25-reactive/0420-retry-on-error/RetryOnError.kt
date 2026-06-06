// A minimal push-based Observable implemented from scratch (no Rx library).
class Observable<T>(private val subscribe: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = subscribe.invoke(observer)

    // retry(n): on error, resubscribe to the source up to n times.
    fun retry(n: Int): Observable<T> = Observable { observer ->
        fun attempt(remaining: Int) {
            subscribe(object : Observer<T> {
                override fun next(value: T) = observer.next(value)
                override fun error(e: Throwable) {
                    if (remaining > 0) attempt(remaining - 1) else observer.error(e)
                }
                override fun complete() = observer.complete()
            })
        }
        attempt(n)
    }
}

interface Observer<T> {
    fun next(value: T)
    fun error(e: Throwable)
    fun complete()
}

fun main() {
    var attempts = 0

    // The source: on each subscription it prints "attempt <k>";
    // for k < 3 it errors, for k == 3 it emits "ok" then completes.
    val source = Observable<String> { observer ->
        attempts += 1
        val k = attempts
        println("attempt $k")
        if (k < 3) {
            observer.error(RuntimeException("fail"))
        } else {
            observer.next("ok")
            observer.complete()
        }
    }

    source.retry(2).subscribe(object : Observer<String> {
        override fun next(value: String) = println(value)
        override fun error(e: Throwable) = println("error")
        override fun complete() {}
    })
}
