class Counter(var value: Int = 0)

interface Command {
    fun execute()
    fun undo()
}

class AddCommand(private val counter: Counter, private val amount: Int) : Command {
    override fun execute() {
        counter.value += amount
    }

    override fun undo() {
        counter.value -= amount
    }
}

fun main() {
    val counter = Counter(0)
    val command: Command = AddCommand(counter, 5)
    command.execute()
    print(counter.value)
    command.undo()
    println(" ${counter.value}")
}
