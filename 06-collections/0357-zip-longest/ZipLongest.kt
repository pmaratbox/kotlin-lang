fun main() {
    val a = listOf(1, 2, 3)
    val b = listOf("a", "b")
    val n = maxOf(a.size, b.size)
    val result = (0 until n).joinToString(" ") { i ->
        val left = a.getOrNull(i)?.toString() ?: "-"
        val right = b.getOrNull(i) ?: "-"
        "$left$right"
    }
    println(result)
}
