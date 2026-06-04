fun rabinKarp(text: String, pattern: String): List<Int> {
    val m = pattern.length
    val n = text.length
    val result = mutableListOf<Int>()
    if (m == 0 || m > n) return result

    val base = 256L
    val mod = 1_000_000_007L
    var high = 1L
    repeat(m - 1) { high = high * base % mod }

    var patHash = 0L
    var winHash = 0L
    for (i in 0 until m) {
        patHash = (patHash * base + pattern[i].code) % mod
        winHash = (winHash * base + text[i].code) % mod
    }

    for (i in 0..n - m) {
        if (patHash == winHash && text.substring(i, i + m) == pattern) {
            result.add(i)
        }
        if (i < n - m) {
            winHash = (winHash - text[i].code * high % mod + mod) % mod
            winHash = (winHash * base + text[i + m].code) % mod
        }
    }
    return result
}

fun main() {
    println(rabinKarp("xabxab", "ab").joinToString(" "))
}
