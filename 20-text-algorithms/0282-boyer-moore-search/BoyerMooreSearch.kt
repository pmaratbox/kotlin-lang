fun boyerMoore(text: String, pattern: String): Int {
    val m = pattern.length
    val n = text.length
    if (m == 0) return 0
    val last = HashMap<Char, Int>()
    for (i in pattern.indices) last[pattern[i]] = i

    var s = 0
    while (s <= n - m) {
        var j = m - 1
        while (j >= 0 && pattern[j] == text[s + j]) j--
        if (j < 0) return s
        val badCharShift = j - (last[text[s + j]] ?: -1)
        s += maxOf(1, badCharShift)
    }
    return -1
}

fun main() {
    println(boyerMoore("zzabc", "abc"))
}
