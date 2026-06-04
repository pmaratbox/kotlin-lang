fun squareDigitSum(n: Int): Int {
    var x = n
    var sum = 0
    while (x > 0) {
        val d = x % 10
        sum += d * d
        x /= 10
    }
    return sum
}

fun isHappy(n: Int): Boolean {
    var x = n
    val seen = mutableSetOf<Int>()
    while (x != 1 && x !in seen) {
        seen.add(x)
        x = squareDigitSum(x)
    }
    return x == 1
}

fun main() {
    println(if (isHappy(19)) "yes" else "no")
}
