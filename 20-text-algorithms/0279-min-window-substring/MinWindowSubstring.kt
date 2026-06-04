fun minWindow(s: String, t: String): String {
    if (t.isEmpty() || s.length < t.length) return ""
    val need = HashMap<Char, Int>()
    for (c in t) need[c] = (need[c] ?: 0) + 1
    var missing = t.length
    var left = 0
    var bestStart = 0
    var bestLen = Int.MAX_VALUE

    for (right in s.indices) {
        val c = s[right]
        if ((need[c] ?: 0) > 0) missing--
        need[c] = (need[c] ?: 0) - 1
        while (missing == 0) {
            if (right - left + 1 < bestLen) {
                bestLen = right - left + 1
                bestStart = left
            }
            val lc = s[left]
            need[lc] = (need[lc] ?: 0) + 1
            if ((need[lc] ?: 0) > 0) missing++
            left++
        }
    }
    return if (bestLen == Int.MAX_VALUE) "" else s.substring(bestStart, bestStart + bestLen)
}

fun main() {
    println(minWindow("ADOBECODEBANC", "ABC"))
}
