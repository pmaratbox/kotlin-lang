fun main() {
    val nums = listOf(1, 2, 3, 4)
    val sums = nums.runningReduce { acc, n -> acc + n }
    println(sums.joinToString(" "))
}
