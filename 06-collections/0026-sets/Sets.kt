fun main() {
    val nums = setOf(1, 2, 2, 3)
    println("size: ${nums.size}")
    println("has 2: ${if (2 in nums) "yes" else "no"}")
    println("has 5: ${if (5 in nums) "yes" else "no"}")
}
