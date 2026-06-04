fun zFunction(s: String): IntArray {
    val n = s.length
    val z = IntArray(n)
    var l = 0
    var r = 0
    for (i in 1 until n) {
        if (i < r) z[i] = minOf(r - i, z[i - l])
        while (i + z[i] < n && s[z[i]] == s[i + z[i]]) z[i]++
        if (i + z[i] > r) {
            l = i
            r = i + z[i]
        }
    }
    return z
}

fun main() {
    val z = zFunction("aaaa")
    println(z.drop(1).joinToString(" "))
}
