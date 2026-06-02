fun main() {
    val nums = listOf(1, 2, 3, 4)
    for (window in nums.windowed(2)) {
        println(window.joinToString(" "))
    }
}
