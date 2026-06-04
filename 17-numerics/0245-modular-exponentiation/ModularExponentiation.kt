fun modPow(base: Int, exp: Int, mod: Int): Int {
    var result = 1
    var b = base % mod
    var e = exp
    while (e > 0) {
        if (e and 1 == 1) result = result * b % mod
        b = b * b % mod
        e = e shr 1
    }
    return result
}

fun main() {
    println(modPow(3, 13, 7))
}
