class Observer<T>(
    val next: (T) -> Unit,
    val complete: () -> Unit = {},
)

class Observable<T>(private val subscribe: (Observer<T>) -> Unit) {
    fun subscribe(observer: Observer<T>) = subscribe.invoke(observer)
}

fun <T> fromValues(vararg values: T): Observable<T> =
    Observable { observer ->
        for (v in values) observer.next(v)
        observer.complete()
    }

fun zip(a: Observable<Int>, b: Observable<Int>, combine: (Int, Int) -> Int): Observable<Int> =
    Observable { observer ->
        val qa = ArrayDeque<Int>()
        val qb = ArrayDeque<Int>()
        fun pump() {
            while (qa.isNotEmpty() && qb.isNotEmpty()) {
                observer.next(combine(qa.removeFirst(), qb.removeFirst()))
            }
        }
        a.subscribe(Observer({ x -> qa.addLast(x); pump() }))
        b.subscribe(Observer({ y -> qb.addLast(y); pump() }))
    }

fun main() {
    val a = fromValues(1, 2, 3)
    val b = fromValues(10, 20, 30)
    zip(a, b) { x, y -> x + y }.subscribe(Observer({ println(it) }))
}
