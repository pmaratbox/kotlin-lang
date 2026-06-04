fun flatten(node: Any): List<Int> = when (node) {
    is Int -> listOf(node)
    is List<*> -> node.filterNotNull().flatMap { flatten(it) }
    else -> emptyList()
}

fun main() {
    val nested = listOf(1, listOf(2, listOf(3, 4)), 5)
    println(flatten(nested).joinToString(" "))
}
