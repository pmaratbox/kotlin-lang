fun main() {
    val grid = listOf(
        listOf(1, 3, 1),
        listOf(1, 5, 1),
        listOf(4, 2, 1),
    )
    val rows = grid.size
    val cols = grid[0].size
    val dp = Array(rows) { IntArray(cols) }
    for (r in 0 until rows) {
        for (c in 0 until cols) {
            val up = if (r > 0) dp[r - 1][c] else Int.MAX_VALUE
            val left = if (c > 0) dp[r][c - 1] else Int.MAX_VALUE
            val best = if (r == 0 && c == 0) 0 else minOf(up, left)
            dp[r][c] = grid[r][c] + best
        }
    }
    println(dp[rows - 1][cols - 1])
}
