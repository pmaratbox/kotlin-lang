fun permute(items: List<Int>): List<List<Int>> {
    if (items.isEmpty()) return listOf(emptyList())
    val result = mutableListOf<List<Int>>()
    for (i in items.indices) {
        val rest = items.toMutableList().apply { removeAt(i) }
        for (p in permute(rest)) {
            result.add(listOf(items[i]) + p)
        }
    }
    return result
}

fun main() {
    for (p in permute(listOf(1, 2, 3))) {
        println(p.joinToString(" "))
    }
}
