fun main() {
    val a = intArrayOf(5, 1, 4, 2)
    for (i in a.indices) {
        var min = i
        for (j in i + 1 until a.size) {
            if (a[j] < a[min]) min = j
        }
        val t = a[i]; a[i] = a[min]; a[min] = t
    }
    println(a.joinToString(" "))
}
