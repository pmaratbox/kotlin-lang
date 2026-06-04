fun countdown(n: Int): List<Int> =
    if (n < 1) emptyList() else listOf(n) + countdown(n - 1)

fun main() {
    println(countdown(5).joinToString(" "))
}
