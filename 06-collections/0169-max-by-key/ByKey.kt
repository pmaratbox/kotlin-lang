fun main() {
    val longest = listOf("a", "bbb", "cc").maxByOrNull { it.length }
    println(longest)
}
