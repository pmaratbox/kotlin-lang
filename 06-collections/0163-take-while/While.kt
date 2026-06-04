fun main() {
    val taken = listOf(1, 2, 3, 4, 1).takeWhile { it < 3 }
    println(taken.joinToString(" "))
}
