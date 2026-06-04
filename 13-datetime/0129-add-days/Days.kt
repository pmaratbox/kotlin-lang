fun daysFromCivil(yIn: Int, m: Int, d: Int): Long {
    val y = if (m <= 2) yIn - 1 else yIn
    val era = (if (y >= 0) y else y - 399) / 400
    val yoe = (y - era * 400).toLong()
    val doy = (153 * (if (m > 2) m - 3 else m + 9) + 2) / 5 + d - 1
    val doe = yoe * 365 + yoe / 4 - yoe / 100 + doy
    return era.toLong() * 146097 + doe - 719468
}

fun civilFromDays(zIn: Long): Triple<Int, Int, Int> {
    val z = zIn + 719468
    val era = (if (z >= 0) z else z - 146096) / 146097
    val doe = z - era * 146097
    val yoe = (doe - doe / 1460 + doe / 36524 - doe / 146096) / 365
    val y = yoe + era * 400
    val doy = doe - (365 * yoe + yoe / 4 - yoe / 100)
    val mp = (5 * doy + 2) / 153
    val d = (doy - (153 * mp + 2) / 5 + 1).toInt()
    val m = (if (mp < 10) mp + 3 else mp - 9).toInt()
    val year = (if (m <= 2) y + 1 else y).toInt()
    return Triple(year, m, d)
}

fun main() {
    val (y, m, d) = civilFromDays(daysFromCivil(2000, 1, 1) + 40)
    println("%04d-%02d-%02d".format(y, m, d))
}
