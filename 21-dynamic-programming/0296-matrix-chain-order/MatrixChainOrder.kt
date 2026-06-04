fun main() {
    val dims = listOf(10, 20, 30, 40)
    val n = dims.size - 1
    val dp = Array(n) { IntArray(n) }
    for (len in 2..n) {
        for (i in 0..n - len) {
            val j = i + len - 1
            dp[i][j] = Int.MAX_VALUE
            for (k in i until j) {
                val cost = dp[i][k] + dp[k + 1][j] +
                    dims[i] * dims[k + 1] * dims[j + 1]
                dp[i][j] = minOf(dp[i][j], cost)
            }
        }
    }
    println(dp[0][n - 1])
}
