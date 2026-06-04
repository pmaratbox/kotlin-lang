fun main() {
    val xs = listOf(1, 2, 3, 4)
    val scanned = xs.runningReduce { acc, x -> acc * x }
    println(scanned.joinToString(" "))
}
