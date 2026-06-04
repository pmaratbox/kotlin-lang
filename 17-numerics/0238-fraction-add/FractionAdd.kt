fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

fun main() {
    val n1 = 1; val d1 = 2
    val n2 = 1; val d2 = 3
    var num = n1 * d2 + n2 * d1
    var den = d1 * d2
    val g = gcd(num, den)
    num /= g
    den /= g
    println("$num/$den")
}
