fun main() {
    val queue = ArrayDeque<Int>()
    queue.addLast(1)
    queue.addLast(2)
    queue.addLast(3)

    val out = mutableListOf<String>()
    while (queue.isNotEmpty()) {
        out.add(queue.removeFirst().toString())
    }
    println(out.joinToString(" "))
}
