fun fastPow(base: Long, exp: Int): Long {
    var result = 1L
    var b = base
    var e = exp
    while (e > 0) {
        if (e and 1 == 1) result *= b
        b *= b
        e = e shr 1
    }
    return result
}

fun main() {
    println(fastPow(2, 10))
}
