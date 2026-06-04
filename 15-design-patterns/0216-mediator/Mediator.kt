class Mediator {
    lateinit var b: Colleague

    fun route(message: String) {
        b.receive(message)
    }
}

class Colleague(val name: String, private val mediator: Mediator) {
    fun send(message: String) {
        mediator.route(message)
    }

    fun receive(message: String) {
        println("$name got: $message")
    }
}

fun main() {
    val mediator = Mediator()
    val a = Colleague("A", mediator)
    val b = Colleague("B", mediator)
    mediator.b = b
    a.send("hi")
}
