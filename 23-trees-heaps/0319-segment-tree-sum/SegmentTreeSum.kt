class SegmentTree(private val data: IntArray) {
    private val n = data.size
    private val tree = IntArray(2 * n)

    init {
        for (i in 0 until n) tree[n + i] = data[i]
        for (i in n - 1 downTo 1) tree[i] = tree[2 * i] + tree[2 * i + 1]
    }

    fun query(left: Int, right: Int): Int {
        var l = left + n
        var r = right + n + 1
        var sum = 0
        while (l < r) {
            if (l and 1 == 1) sum += tree[l++]
            if (r and 1 == 1) sum += tree[--r]
            l = l shr 1
            r = r shr 1
        }
        return sum
    }
}

fun main() {
    val st = SegmentTree(intArrayOf(1, 2, 3, 4, 5))
    println(st.query(1, 3))
}
