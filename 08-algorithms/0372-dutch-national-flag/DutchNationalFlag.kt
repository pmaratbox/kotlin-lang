fun main() {
    val a = intArrayOf(2, 0, 2, 1, 1, 0)
    var low = 0; var mid = 0; var high = a.size - 1
    while (mid <= high) {
        when (a[mid]) {
            0 -> { val t = a[low]; a[low] = a[mid]; a[mid] = t; low++; mid++ }
            1 -> mid++
            else -> { val t = a[high]; a[high] = a[mid]; a[mid] = t; high-- }
        }
    }
    println(a.joinToString(" "))
}
