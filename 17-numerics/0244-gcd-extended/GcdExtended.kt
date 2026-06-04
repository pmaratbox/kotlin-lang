fun extGcd(a: Int, b: Int): Triple<Int, Int, Int> {
    if (b == 0) return Triple(a, 1, 0)
    val (g, x, y) = extGcd(b, a % b)
    return Triple(g, y, x - (a / b) * y)
}

fun main() {
    val (g, x, y) = extGcd(30, 12)
    println("$g $x $y")
}
