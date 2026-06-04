fun isPowerOfTwo(n: Int): Boolean = n > 0 && (n and (n - 1)) == 0

fun main() {
    val a = if (isPowerOfTwo(16)) "yes" else "no"
    val b = if (isPowerOfTwo(18)) "yes" else "no"
    println("$a $b")
}
