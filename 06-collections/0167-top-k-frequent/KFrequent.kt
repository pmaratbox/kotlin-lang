fun main() {
    val items = listOf("a", "b", "a", "c", "b", "a")
    val top = items.groupingBy { it }.eachCount()
        .entries
        .sortedByDescending { it.value }
        .take(2)
        .map { it.key }
    println(top.joinToString(" "))
}
