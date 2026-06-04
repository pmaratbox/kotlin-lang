fun main() {
    var n = 60
    val factors = mutableListOf<Int>()
    while (n % 2 == 0) {
        factors.add(2)
        n /= 2
    }
    var f = 3
    while (f * f <= n) {
        while (n % f == 0) {
            factors.add(f)
            n /= f
        }
        f += 2
    }
    if (n > 1) factors.add(n)
    println(factors.joinToString(" "))
}
