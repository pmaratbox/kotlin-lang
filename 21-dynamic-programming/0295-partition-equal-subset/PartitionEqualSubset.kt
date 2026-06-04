fun main() {
    val nums = listOf(1, 5, 11, 5)
    val total = nums.sum()
    if (total % 2 != 0) {
        println("no")
        return
    }
    val target = total / 2
    val dp = BooleanArray(target + 1)
    dp[0] = true
    for (num in nums) {
        for (s in target downTo num) {
            if (dp[s - num]) dp[s] = true
        }
    }
    println(if (dp[target]) "yes" else "no")
}
