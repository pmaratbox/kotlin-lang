fun zeller(yearIn: Int, monthIn: Int, day: Int): String {
    var month = monthIn
    var year = yearIn
    if (month < 3) {
        month += 12
        year -= 1
    }
    val k = year % 100
    val j = year / 100
    val h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7
    // Zeller: 0=Saturday, 1=Sunday, ... 6=Friday
    val names = listOf(
        "Saturday", "Sunday", "Monday", "Tuesday",
        "Wednesday", "Thursday", "Friday"
    )
    return names[h]
}

fun main() {
    println(zeller(2000, 1, 1))
}
