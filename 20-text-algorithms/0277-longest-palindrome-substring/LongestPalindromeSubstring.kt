fun longestPalindrome(s: String): String {
    if (s.isEmpty()) return ""
    var start = 0
    var maxLen = 1

    fun expand(l0: Int, r0: Int) {
        var l = l0
        var r = r0
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            if (r - l + 1 > maxLen) {
                start = l
                maxLen = r - l + 1
            }
            l--
            r++
        }
    }

    for (i in s.indices) {
        expand(i, i)
        expand(i, i + 1)
    }
    return s.substring(start, start + maxLen)
}

fun main() {
    println(longestPalindrome("babad"))
}
