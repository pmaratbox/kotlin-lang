import java.util.ArrayDeque

fun main() {
    val adj = mapOf(
        0 to listOf(1, 2),
        1 to listOf(0, 3),
        2 to listOf(0, 3),
        3 to listOf(1, 2),
    )
    val visited = mutableSetOf(0)
    val queue = ArrayDeque<Int>()
    queue.add(0)
    val order = mutableListOf<Int>()
    while (queue.isNotEmpty()) {
        val node = queue.poll()
        order.add(node)
        for (n in adj.getValue(node)) {
            if (visited.add(n)) queue.add(n)
        }
    }
    println(order.joinToString(" "))
}
