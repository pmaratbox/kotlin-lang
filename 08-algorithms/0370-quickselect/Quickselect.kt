fun partition(a: IntArray, lo: Int, hi: Int): Int {
    val pivot = a[hi]
    var i = lo
    for (j in lo until hi) {
        if (a[j] < pivot) {
            val t = a[i]; a[i] = a[j]; a[j] = t
            i++
        }
    }
    val t = a[i]; a[i] = a[hi]; a[hi] = t
    return i
}

fun quickselect(a: IntArray, k: Int): Int {
    var lo = 0; var hi = a.size - 1
    while (lo < hi) {
        val p = partition(a, lo, hi)
        when {
            p == k -> return a[p]
            p < k -> lo = p + 1
            else -> hi = p - 1
        }
    }
    return a[lo]
}

fun main() {
    val a = intArrayOf(7, 10, 4, 3, 20, 15)
    println(quickselect(a, 2))
}
