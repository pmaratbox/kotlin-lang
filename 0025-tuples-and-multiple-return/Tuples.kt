fun minMax(a: Int, b: Int): Pair<Int, Int> =
    if (a < b) Pair(a, b) else Pair(b, a)

fun main() {
    val (lo, hi) = minMax(3, 7)
    println("min: $lo")
    println("max: $hi")
}
