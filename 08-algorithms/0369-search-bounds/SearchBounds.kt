fun lowerBound(a: IntArray, x: Int): Int {
    var lo = 0; var hi = a.size
    while (lo < hi) {
        val mid = (lo + hi) / 2
        if (a[mid] < x) lo = mid + 1 else hi = mid
    }
    return lo
}

fun upperBound(a: IntArray, x: Int): Int {
    var lo = 0; var hi = a.size
    while (lo < hi) {
        val mid = (lo + hi) / 2
        if (a[mid] <= x) lo = mid + 1 else hi = mid
    }
    return lo
}

fun main() {
    val a = intArrayOf(1, 3, 5, 5, 7)
    println("${lowerBound(a, 5)} ${upperBound(a, 5)}")
}
