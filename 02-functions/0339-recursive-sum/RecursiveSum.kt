fun sum(xs: List<Int>): Int =
    if (xs.isEmpty()) 0 else xs.first() + sum(xs.drop(1))

fun main() {
    println(sum(listOf(1, 2, 3, 4)))
}
