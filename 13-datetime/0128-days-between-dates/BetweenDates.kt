fun daysFromCivil(yIn: Int, m: Int, d: Int): Long {
    val y = if (m <= 2) yIn - 1 else yIn
    val era = (if (y >= 0) y else y - 399) / 400
    val yoe = (y - era * 400).toLong()
    val doy = (153 * (if (m > 2) m - 3 else m + 9) + 2) / 5 + d - 1
    val doe = yoe * 365 + yoe / 4 - yoe / 100 + doy
    return era.toLong() * 146097 + doe - 719468
}

fun main() {
    val start = daysFromCivil(2000, 1, 1)
    val end = daysFromCivil(2000, 12, 31)
    println(end - start)
}
