fun main() {
    val text = "hello"
    val mostFrequent = text.groupingBy { it }.eachCount().maxByOrNull { it.value }!!.key
    println(mostFrequent)
}
