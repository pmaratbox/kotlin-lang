fun main() {
    var row = listOf(1)
    repeat(4) {
        println(row.joinToString(" "))
        row = listOf(1) + (0 until row.size - 1).map { row[it] + row[it + 1] } + listOf(1)
    }
}
