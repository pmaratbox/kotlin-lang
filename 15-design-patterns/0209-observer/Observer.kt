interface Observer {
    fun update(value: Int)
}

class IdObserver(private val id: String) : Observer {
    override fun update(value: Int) {
        println("$id: $value")
    }
}

class Subject {
    private val observers = mutableListOf<Observer>()

    fun subscribe(o: Observer) {
        observers.add(o)
    }

    fun notify(value: Int) {
        observers.forEach { it.update(value) }
    }
}

fun main() {
    val subject = Subject()
    subject.subscribe(IdObserver("obs1"))
    subject.subscribe(IdObserver("obs2"))
    subject.notify(5)
}
