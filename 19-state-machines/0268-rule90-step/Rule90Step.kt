fun main() {
    val row = "00100".map { it - '0' }
    val next = row.indices.map { i ->
        val left = if (i > 0) row[i - 1] else 0
        val right = if (i < row.size - 1) row[i + 1] else 0
        left xor right
    }
    println(next.joinToString(""))
}
