fun suffixArray(s: String): List<Int> =
    s.indices.sortedBy { s.substring(it) }

fun main() {
    println(suffixArray("banana").joinToString(" "))
}
