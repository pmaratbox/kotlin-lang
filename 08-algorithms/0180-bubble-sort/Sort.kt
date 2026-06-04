fun main() {
    val a = intArrayOf(5, 1, 4, 2, 8)
    for (i in a.indices) {
        for (j in 0 until a.size - 1 - i) {
            if (a[j] > a[j + 1]) {
                val t = a[j]; a[j] = a[j + 1]; a[j + 1] = t
            }
        }
    }
    println(a.joinToString(" "))
}
