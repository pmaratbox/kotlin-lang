fun main() {
    val daysInMonth = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val month = 3
    val day = 1
    var dayOfYear = day
    for (m in 0 until month - 1) {
        dayOfYear += daysInMonth[m]
    }
    println(dayOfYear)
}
