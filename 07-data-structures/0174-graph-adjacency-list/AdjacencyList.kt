fun main() {
    val adj = mapOf(
        0 to listOf(1, 2),
        1 to listOf(0, 3),
        2 to listOf(0, 3),
        3 to listOf(1, 2),
    )
    println(adj.getValue(0).joinToString(" "))
}
