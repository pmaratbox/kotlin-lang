fun siftDown(a: IntArray, start: Int, end: Int) {
    var root = start
    while (2 * root + 1 < end) {
        var child = 2 * root + 1
        if (child + 1 < end && a[child] < a[child + 1]) child++
        if (a[root] >= a[child]) return
        val tmp = a[root]; a[root] = a[child]; a[child] = tmp
        root = child
    }
}

fun heapSort(a: IntArray) {
    val n = a.size
    for (i in n / 2 - 1 downTo 0) siftDown(a, i, n)
    for (end in n - 1 downTo 1) {
        val tmp = a[0]; a[0] = a[end]; a[end] = tmp
        siftDown(a, 0, end)
    }
}

fun main() {
    val a = intArrayOf(5, 3, 8, 1, 4)
    heapSort(a)
    println(a.joinToString(" "))
}
