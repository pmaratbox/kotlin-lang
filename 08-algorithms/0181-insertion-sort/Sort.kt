fun main() {
    val a = intArrayOf(5, 1, 4, 2, 8)
    for (i in 1 until a.size) {
        val key = a[i]
        var j = i - 1
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j]
            j--
        }
        a[j + 1] = key
    }
    println(a.joinToString(" "))
}
