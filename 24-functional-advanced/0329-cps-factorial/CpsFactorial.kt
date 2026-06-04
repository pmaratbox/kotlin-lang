fun factCps(n: Int, k: (Int) -> Int): Int =
    if (n == 0) k(1) else factCps(n - 1) { k(n * it) }

fun main() {
    println(factCps(5) { it })
}
