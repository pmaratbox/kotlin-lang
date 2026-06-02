fun main() {
    val nums = listOf(2, 7, 11, 15)
    val target = 9
    val seen = HashMap<Int, Int>()
    for (i in nums.indices) {
        val j = seen[target - nums[i]]
        if (j != null) {
            println("$j $i")
            break
        }
        seen[nums[i]] = i
    }
}
