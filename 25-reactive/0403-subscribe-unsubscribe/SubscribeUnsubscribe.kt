class Subscription(private val onUnsubscribe: () -> Unit) {
    var closed = false
        private set

    fun unsubscribe() {
        if (!closed) {
            closed = true
            onUnsubscribe()
        }
    }
}

class Observable(private val producer: (Observer) -> Unit) {
    fun subscribe(observer: Observer): Subscription {
        val sub = Subscription { }
        observer.subscription = sub
        producer(observer)
        return sub
    }
}

class Observer(val onNext: (Observer, Int) -> Unit) {
    var subscription: Subscription? = null

    fun next(value: Int) {
        if (subscription?.closed == true) return
        onNext(this, value)
    }
}

fun main() {
    val source = Observable { observer ->
        for (v in listOf(1, 2, 3, 4)) {
            if (observer.subscription?.closed == true) break
            observer.next(v)
        }
    }

    val observer = Observer { self, value ->
        println(value)
        if (value == 2) self.subscription?.unsubscribe()
    }
    source.subscribe(observer)
}
