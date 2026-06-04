fun main() {
    val names = arrayOf(
        "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    )
    val start = 6 // Saturday
    val result = (start + 3) % 7
    println(names[result])
}
