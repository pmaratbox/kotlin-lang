fun <T> first(items: List<T>): T = items[0]

fun main() {
    val ints = listOf(1, 2, 3)
    val strs = listOf("a", "b", "c")

    println("first int: ${first(ints)}")
    println("first string: ${first(strs)}")
}
