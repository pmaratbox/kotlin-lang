class SparseMatrix {
    private val entries = HashMap<Pair<Int, Int>, Int>()

    fun set(row: Int, col: Int, value: Int) {
        if (value == 0) entries.remove(row to col) else entries[row to col] = value
    }

    fun get(row: Int, col: Int): Int = entries[row to col] ?: 0
}

fun main() {
    val matrix = SparseMatrix()
    matrix.set(1, 1, 5)
    println("${matrix.get(1, 1)} ${matrix.get(0, 0)}")
}
