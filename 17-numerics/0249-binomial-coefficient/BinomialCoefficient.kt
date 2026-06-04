fun binomial(n: Int, k: Int): Long {
    var result = 1L
    for (i in 0 until k) {
        result = result * (n - i) / (i + 1)
    }
    return result
}

fun main() {
    println(binomial(5, 2))
}
