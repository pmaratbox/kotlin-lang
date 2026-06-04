fun atoi(s: String): Int {
    var i = 0
    var sign = 1
    if (i < s.length && (s[i] == '-' || s[i] == '+')) {
        if (s[i] == '-') sign = -1
        i++
    }
    var value = 0
    while (i < s.length && s[i].isDigit()) {
        value = value * 10 + (s[i] - '0')
        i++
    }
    return sign * value
}

fun itoa(n: Int): String {
    if (n == 0) return "0"
    val negative = n < 0
    var value = if (negative) -n else n
    val digits = StringBuilder()
    while (value > 0) {
        digits.append('0' + value % 10)
        value /= 10
    }
    if (negative) digits.append('-')
    return digits.reverse().toString()
}

fun main() {
    val parsed = atoi("-42")
    val formatted = itoa(parsed)
    println("$parsed $formatted")
}
