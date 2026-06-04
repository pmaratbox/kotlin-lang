val adj = mapOf(
    0 to listOf(1, 2),
    1 to listOf(0, 3),
    2 to listOf(0, 3),
    3 to listOf(1, 2),
)

fun dfs(node: Int, visited: MutableSet<Int>, order: MutableList<Int>) {
    if (!visited.add(node)) return
    order.add(node)
    for (n in adj.getValue(node)) dfs(n, visited, order)
}

fun main() {
    val order = mutableListOf<Int>()
    dfs(0, mutableSetOf(), order)
    println(order.joinToString(" "))
}
