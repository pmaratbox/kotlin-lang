fun main() {
    val nums = listOf(2, 4, 6)
    val allEven = if (nums.all { it % 2 == 0 }) "yes" else "no"
    val anyOdd = if (nums.any { it % 2 != 0 }) "yes" else "no"
    println("$allEven $anyOdd")
}
