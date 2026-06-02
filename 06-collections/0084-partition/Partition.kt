fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    val (evens, odds) = nums.partition { it % 2 == 0 }
    println("evens: " + evens.joinToString(" "))
    println("odds: " + odds.joinToString(" "))
}
