class EventEmitter {
    private val topics = mutableMapOf<String, MutableList<(String) -> Unit>>()

    fun on(topic: String, handler: (String) -> Unit) {
        topics.getOrPut(topic) { mutableListOf() }.add(handler)
    }

    fun off(topic: String, handler: (String) -> Unit) {
        topics[topic]?.remove(handler)
    }

    fun emit(topic: String, payload: String) {
        topics[topic]?.toList()?.forEach { it(payload) }
    }
}

fun main() {
    val emitter = EventEmitter()
    val h: (String) -> Unit = { payload -> println("hi $payload") }
    val g: (String) -> Unit = { payload -> println("bye $payload") }

    emitter.on("greet", h)
    emitter.on("bye", g)

    emitter.emit("greet", "ada")
    emitter.emit("bye", "ada")

    emitter.off("greet", h)
    emitter.emit("greet", "x")
}
