fun main() {
    val a = intArrayOf(3, 1, 2, 3, 1)
    val counts = IntArray(a.max() + 1)
    for (v in a) counts[v]++
    val out = buildList {
        for (v in counts.indices) repeat(counts[v]) { add(v) }
    }
    println(out.joinToString(" "))
}
