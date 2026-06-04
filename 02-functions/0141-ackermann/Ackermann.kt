fun ackermann(m: Int, n: Int): Int =
    when {
        m == 0 -> n + 1
        n == 0 -> ackermann(m - 1, 1)
        else -> ackermann(m - 1, ackermann(m, n - 1))
    }

fun main() {
    println(ackermann(2, 3))
}
