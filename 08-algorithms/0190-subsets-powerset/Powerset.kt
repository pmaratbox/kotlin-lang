fun main() {
    val items = listOf(1, 2, 3)
    for (mask in 0 until (1 shl items.size)) {
        val subset = items.filterIndexed { i, _ -> (mask shr i) and 1 == 1 }
        println(if (subset.isEmpty()) "{}" else subset.joinToString(" "))
    }
}
