fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

fun lcm(a: Int, b: Int): Int = a / gcd(a, b) * b

fun main() {
    println(lcm(4, 6))
}
