fun main() {
    val letters = listOf("a", "b", "c")
    val nums = listOf(1, 2, 3)
    val result = letters.zip(nums).joinToString(" ") { (k, n) -> "$k=$n" }
    println(result)
}
