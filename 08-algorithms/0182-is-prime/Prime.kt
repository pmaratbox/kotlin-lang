fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    var i = 2
    while (i * i <= n) {
        if (n % i == 0) return false
        i++
    }
    return true
}

fun main() {
    println(listOf(7, 9).joinToString(" ") { if (isPrime(it)) "yes" else "no" })
}
