fun main() {
    val nums = listOf(1, 2)
    val letters = listOf("a", "b")
    val pairs = nums.flatMap { n -> letters.map { l -> "$n$l" } }
    println(pairs.joinToString(" "))
}
