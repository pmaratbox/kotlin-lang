fun main() {
    val nums = listOf(3, 1, 2)
    val asc = nums.sorted()
    val desc = nums.sortedWith(compareByDescending { it })
    println("asc: ${asc.joinToString(" ")}")
    println("desc: ${desc.joinToString(" ")}")
}
