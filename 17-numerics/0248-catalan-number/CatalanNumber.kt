fun main() {
    val result = mutableListOf<Long>()
    var c = 1L
    for (n in 0 until 5) {
        result.add(c)
        c = c * 2 * (2 * n + 1) / (n + 2)
    }
    println(result.joinToString(" "))
}
