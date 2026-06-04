fun main() {
    val items = listOf(2 to 3, 3 to 4, 4 to 5)
    val capacity = 5
    val dp = IntArray(capacity + 1)
    for ((w, v) in items) {
        for (c in capacity downTo w) {
            dp[c] = maxOf(dp[c], dp[c - w] + v)
        }
    }
    println(dp[capacity])
}
