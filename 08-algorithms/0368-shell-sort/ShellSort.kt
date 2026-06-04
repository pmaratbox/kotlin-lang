fun main() {
    val a = intArrayOf(5, 2, 8, 1, 9, 3)
    var gap = a.size / 2
    while (gap > 0) {
        for (i in gap until a.size) {
            val tmp = a[i]
            var j = i
            while (j >= gap && a[j - gap] > tmp) {
                a[j] = a[j - gap]
                j -= gap
            }
            a[j] = tmp
        }
        gap /= 2
    }
    println(a.joinToString(" "))
}
