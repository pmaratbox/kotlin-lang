fun main() {
    val rows = listOf("a" to "1", "bb" to "22")
    val width = rows.maxOf { it.first.length }
    for ((c1, c2) in rows) {
        println("${c1.padEnd(width)} | $c2")
    }
}
