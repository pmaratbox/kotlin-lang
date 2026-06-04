fun longestCommonSubstring(a: String, b: String): String {
    val dp = Array(a.length + 1) { IntArray(b.length + 1) }
    var best = 0
    var endA = 0
    for (i in 1..a.length) {
        for (j in 1..b.length) {
            if (a[i - 1] == b[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
                if (dp[i][j] > best) {
                    best = dp[i][j]
                    endA = i
                }
            }
        }
    }
    return a.substring(endA - best, endA)
}

fun main() {
    println(longestCommonSubstring("abcde", "xbcdy"))
}
