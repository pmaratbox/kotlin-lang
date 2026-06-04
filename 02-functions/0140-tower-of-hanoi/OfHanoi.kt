fun moves(n: Int): Int =
    if (n == 0) 0 else 2 * moves(n - 1) + 1

fun main() {
    println(moves(3))
}
