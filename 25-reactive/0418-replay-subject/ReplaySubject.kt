class Observer<T>(val next: (T) -> Unit)

class ReplaySubject<T>(private val bufferSize: Int) {
    private val buffer = ArrayDeque<T>()
    private val observers = mutableListOf<Observer<T>>()

    fun next(value: T) {
        buffer.addLast(value)
        while (buffer.size > bufferSize) buffer.removeFirst()
        for (o in observers) o.next(value)
    }

    fun subscribe(observer: Observer<T>) {
        for (v in buffer) observer.next(v)
        observers.add(observer)
    }
}

fun main() {
    val subject = ReplaySubject<Int>(2)
    subject.next(1)
    subject.next(2)
    subject.next(3)
    subject.subscribe(Observer { println(it) })
    subject.next(4)
}
