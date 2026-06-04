fun isLeap(year: Int): Boolean =
    year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

fun febDays(year: Int): Int = if (isLeap(year)) 29 else 28

fun main() {
    println("${febDays(2000)} ${febDays(2001)}")
}
