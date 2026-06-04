fun main() {
    val rows = 3
    val cols = 3
    val dp = Array(rows) { IntArray(cols) { 1 } }
    for (r in 1 until rows) {
        for (c in 1 until cols) {
            dp[r][c] = dp[r - 1][c] + dp[r][c - 1]
        }
    }
    println(dp[rows - 1][cols - 1])
}
