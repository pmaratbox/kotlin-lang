class Memento(val state: Int)

class Originator(var state: Int) {
    fun save() = Memento(state)
    fun restore(memento: Memento) {
        state = memento.state
    }
}

fun main() {
    val originator = Originator(1)
    val saved = originator.save()
    originator.state = 2
    print(originator.state)
    originator.restore(saved)
    println(" ${originator.state}")
}
