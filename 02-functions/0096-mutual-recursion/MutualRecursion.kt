fun isEven(n: Int): Boolean {
    if (n == 0) return true
    return isOdd(n - 1)
}

fun isOdd(n: Int): Boolean {
    if (n == 0) return false
    return isEven(n - 1)
}

fun main() {
    for (n in listOf(4, 3)) {
        println(if (isEven(n)) "even" else "odd")
    }
}
