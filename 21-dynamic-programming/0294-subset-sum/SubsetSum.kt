fun main() {
    val nums = listOf(3, 34, 4, 12, 5, 2)
    val target = 9
    val dp = BooleanArray(target + 1)
    dp[0] = true
    for (num in nums) {
        for (s in target downTo num) {
            if (dp[s - num]) dp[s] = true
        }
    }
    println(if (dp[target]) "yes" else "no")
}
