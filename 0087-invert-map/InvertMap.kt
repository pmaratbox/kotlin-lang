fun main() {
    val m = mapOf("a" to 1, "b" to 2, "c" to 3)
    val inverted = m.entries.associate { (k, v) -> v to k }.toSortedMap()
    println(inverted.entries.joinToString(" ") { "${it.key}:${it.value}" })
}
