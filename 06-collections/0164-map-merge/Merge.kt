fun main() {
    val left = mapOf("a" to 1, "b" to 2)
    val right = mapOf("b" to 3, "c" to 4)
    val merged = left + right
    println(merged.toSortedMap().entries.joinToString(" ") { "${it.key}:${it.value}" })
}
