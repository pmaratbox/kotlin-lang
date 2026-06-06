class Signal<T>(initial: T) {
    private var value: T = initial
    private val subscribers = mutableListOf<() -> Unit>()

    operator fun invoke(): T = value

    fun subscribe(cb: () -> Unit) {
        subscribers.add(cb)
    }

    fun set(newValue: T) {
        value = newValue
        for (cb in subscribers.toList()) cb()
    }
}

class Computed<T>(private vararg val deps: Signal<*>, private val compute: () -> T) {
    private var cached: T = compute()

    init {
        for (dep in deps) dep.subscribe { cached = compute() }
    }

    operator fun invoke(): T = cached
}

fun main() {
    val a = Signal(2)
    val b = Signal(3)
    val sum = Computed(a, b) { a() + b() }

    println(sum())
    a.set(10)
    println(sum())
}
