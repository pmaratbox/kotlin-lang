// Cold vs Hot Observable, implemented from scratch (synchronous, deterministic).

// An observer is just a sink for "next" events.
class Observer(val onNext: (Int) -> Unit)

// A cold observable: subscribing runs the producer afresh for every subscriber.
class ColdObservable(private val producer: (Observer) -> Unit) {
    fun subscribe(observer: Observer) = producer(observer)
}

// A hot observable: a single shared producer; values are pushed only to the
// observers subscribed at the moment of emission.
class HotObservable {
    private val observers = mutableListOf<Observer>()
    fun subscribe(observer: Observer) {
        observers.add(observer)
    }
    fun emit(value: Int) {
        for (o in observers) o.onNext(value)
    }
}

fun main() {
    // COLD: each subscriber triggers an independent run of the producer.
    val cold = ColdObservable { obs ->
        for (v in listOf(1, 2, 3)) obs.onNext(v)
    }
    val coldA = mutableListOf<Int>()
    val coldB = mutableListOf<Int>()
    cold.subscribe(Observer { coldA.add(it) })
    cold.subscribe(Observer { coldB.add(it) })

    // HOT: one shared execution; late subscribers miss earlier values.
    val hot = HotObservable()
    val hotA = mutableListOf<Int>()
    val hotB = mutableListOf<Int>()
    hot.subscribe(Observer { hotA.add(it) }) // A subscribes first
    hot.emit(1)                              // emits 1 -> only A
    hot.subscribe(Observer { hotB.add(it) }) // then B subscribes
    hot.emit(2)                              // 2 -> A and B
    hot.emit(3)                              // 3 -> A and B

    println("cold A: " + coldA.joinToString(" "))
    println("cold B: " + coldB.joinToString(" "))
    println("hot A: " + hotA.joinToString(" "))
    println("hot B: " + hotB.joinToString(" "))
}
