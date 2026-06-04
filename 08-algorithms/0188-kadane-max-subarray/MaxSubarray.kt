fun main() {
    val a = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    var cur = a[0]
    var best = a[0]
    for (x in a.drop(1)) {
        cur = maxOf(cur + x, x)
        best = maxOf(best, cur)
    }
    println(best)
}
