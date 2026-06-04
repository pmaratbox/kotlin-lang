fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

fun main() {
    val num = 6
    val den = 8
    val g = gcd(num, den)
    println("${num / g}/${den / g}")
}
