fun main() {
    val a = listOf(1, 3, 5)
    val b = listOf(2, 4, 6)
    val result = a.zip(b).flatMap { (x, y) -> listOf(x, y) }
    println(result.joinToString(" "))
}
