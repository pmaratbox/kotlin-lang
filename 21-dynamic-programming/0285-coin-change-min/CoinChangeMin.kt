fun main() {
    val coins = listOf(1, 2, 5)
    val amount = 11
    val dp = IntArray(amount + 1) { amount + 1 }
    dp[0] = 0
    for (a in 1..amount) {
        for (c in coins) {
            if (c <= a) dp[a] = minOf(dp[a], dp[a - c] + 1)
        }
    }
    println(dp[amount])
}
