fun main() {
    val list = listOf(1, 2, 3, 4)
    val result = list.windowed(2).joinToString(" ") { (a, b) -> "$a,$b" }
    println(result)
}
