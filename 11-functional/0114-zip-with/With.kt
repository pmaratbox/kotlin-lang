fun main() {
    val a = listOf(1, 2, 3)
    val b = listOf(4, 5, 6)
    val sums = a.zip(b) { x, y -> x + y }
    println(sums.joinToString(" "))
}
