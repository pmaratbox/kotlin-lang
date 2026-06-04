fun main() {
    val rows = listOf(true to true, true to false, false to true, false to false)
    for ((a, b) in rows) {
        println("$a $b ${a && b} ${a || b} ${a xor b}")
    }
}
