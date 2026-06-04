fun reverse(xs: List<Int>): List<Int> =
    if (xs.isEmpty()) emptyList() else reverse(xs.drop(1)) + xs.first()

fun main() {
    println(reverse(listOf(1, 2, 3)).joinToString(" "))
}
