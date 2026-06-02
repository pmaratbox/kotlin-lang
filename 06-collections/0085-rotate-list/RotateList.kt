fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    val k = 2
    val rotated = nums.drop(k) + nums.take(k)
    println(rotated.joinToString(" "))
}
