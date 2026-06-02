fun main() {
    val word = "banana"
    val counts = word.groupingBy { it }.eachCount().toSortedMap()

    println(counts.entries.joinToString(" ") { (ch, n) -> "$ch:$n" })
}
