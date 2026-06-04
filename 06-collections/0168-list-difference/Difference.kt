fun main() {
    val diff = listOf(1, 2, 3, 4) - listOf(2, 4).toSet()
    println(diff.joinToString(" "))
}
