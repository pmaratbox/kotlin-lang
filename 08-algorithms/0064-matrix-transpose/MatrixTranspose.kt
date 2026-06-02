fun main() {
    val matrix = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    val rows = matrix.size
    val cols = matrix[0].size

    for (j in 0 until cols) {
        val row = (0 until rows).map { i -> matrix[i][j] }
        println(row.joinToString(" "))
    }
}
