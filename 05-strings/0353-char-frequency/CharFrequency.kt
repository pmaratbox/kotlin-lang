fun main() {
    val counts = LinkedHashMap<Char, Int>()
    for (ch in "aab") {
        counts[ch] = (counts[ch] ?: 0) + 1
    }
    println(counts.entries.joinToString(" ") { "${it.key}:${it.value}" })
}
