fun main() {
    val nums = listOf(10, 9, 2, 5, 3, 7, 101, 18)
    val dp = IntArray(nums.size) { 1 }
    for (i in nums.indices) {
        for (j in 0 until i) {
            if (nums[j] < nums[i]) dp[i] = maxOf(dp[i], dp[j] + 1)
        }
    }
    println(dp.max())
}
