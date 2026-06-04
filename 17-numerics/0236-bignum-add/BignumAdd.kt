fun addStrings(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0
    val sb = StringBuilder()
    while (i >= 0 || j >= 0 || carry > 0) {
        val da = if (i >= 0) a[i--] - '0' else 0
        val db = if (j >= 0) b[j--] - '0' else 0
        val sum = da + db + carry
        sb.append(('0' + sum % 10))
        carry = sum / 10
    }
    return sb.reverse().toString()
}

fun main() {
    println(addStrings("999999999999", "1"))
}
