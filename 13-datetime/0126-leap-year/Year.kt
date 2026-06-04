fun isLeap(year: Int): Boolean =
    year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

fun main() {
    val years = listOf(2000, 1900, 2024)
    println(years.joinToString(" ") { if (isLeap(it)) "yes" else "no" })
}
