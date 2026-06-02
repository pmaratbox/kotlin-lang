fun main() {
    val nums = listOf(10, 20, 30, 40, 50)
    val slice = nums.subList(1, 4)
    println("slice: ${slice.joinToString(" ")}")
}
