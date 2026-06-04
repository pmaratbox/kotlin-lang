fun multiplyStrings(a: String, b: String): String {
    val result = IntArray(a.length + b.length)
    for (i in a.indices.reversed()) {
        for (j in b.indices.reversed()) {
            val mul = (a[i] - '0') * (b[j] - '0')
            val p1 = i + j
            val p2 = i + j + 1
            val sum = mul + result[p2]
            result[p2] = sum % 10
            result[p1] += sum / 10
        }
    }
    val sb = StringBuilder()
    for (d in result) {
        if (sb.isEmpty() && d == 0) continue
        sb.append(d)
    }
    return if (sb.isEmpty()) "0" else sb.toString()
}

fun main() {
    println(multiplyStrings("123", "456"))
}
