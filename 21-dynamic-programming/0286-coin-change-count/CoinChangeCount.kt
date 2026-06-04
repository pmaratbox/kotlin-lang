fun main() {
    val coins = listOf(1, 2, 5)
    val target = 5
    val dp = IntArray(target + 1)
    dp[0] = 1
    for (c in coins) {
        for (a in c..target) {
            dp[a] += dp[a - c]
        }
    }
    println(dp[target])
}
