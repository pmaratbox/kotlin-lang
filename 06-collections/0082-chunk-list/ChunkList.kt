fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7)
    for (chunk in nums.chunked(3)) {
        println(chunk.joinToString(" "))
    }
}
