fun main() {
    val nums = listOf(1, 2, 3)
    val result = buildString {
        nums.forEachIndexed { i, n ->
            if (i > 0) append("-")
            append(n)
        }
    }
    println(result)
}
