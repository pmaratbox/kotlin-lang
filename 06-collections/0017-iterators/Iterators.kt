fun main() {
    val nums = listOf(1, 2, 3, 4, 5)

    val sum = nums.filter { it % 2 == 0 }.map { it * 2 }.sum()

    println("sum: $sum")
}
