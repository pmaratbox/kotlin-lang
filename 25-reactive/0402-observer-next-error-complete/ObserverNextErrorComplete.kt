class Observer(
    private val onNext: (Int) -> Unit,
    private val onError: (Throwable) -> Unit = {},
    private val onComplete: () -> Unit = {},
) {
    private var stopped = false

    fun next(value: Int) {
        if (stopped) return
        onNext(value)
    }

    fun error(t: Throwable) {
        if (stopped) return
        stopped = true
        onError(t)
    }

    fun complete() {
        if (stopped) return
        stopped = true
        onComplete()
    }
}

fun main() {
    val observer = Observer(
        onNext = { println(it) },
        onComplete = { println("complete") },
    )

    observer.next(1)
    observer.next(2)
    observer.complete()
    observer.next(3)
}
