fun main() {
    val scores = mapOf("a" to 3, "b" to 1, "c" to 2)
    val sorted = scores.entries.sortedBy { it.value }
    println(sorted.joinToString(" ") { "${it.key}:${it.value}" })
}
