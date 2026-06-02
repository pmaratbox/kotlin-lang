fun main() {
    val words = listOf("one", "two", "three")
    val groups = words.groupBy { it.length }.toSortedMap()

    val out = groups.map { (len, ws) -> "$len:[${ws.joinToString(",")}]" }
    println(out.joinToString(" "))
}
