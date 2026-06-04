fun main() {
    val list = listOf(1, 1, 2, 3, 3, 3)
    val result = list.groupBy { it }
        .values
        .sortedByDescending { it.size }
        .flatten()
    println(result.joinToString(" "))
}
