fun main() {
    val result = listOf(1, 2, 3).flatMap { listOf(it, it * 10) }
    println(result.joinToString(" "))
}
