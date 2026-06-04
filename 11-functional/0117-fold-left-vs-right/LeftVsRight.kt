fun main() {
    val xs = listOf(1, 2, 3)
    val left = xs.fold(0) { acc, x -> acc - x }
    val right = xs.foldRight(0) { x, acc -> x - acc }
    println("$left $right")
}
