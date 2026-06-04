class Fenwick(size: Int) {
    private val tree = IntArray(size + 1)

    fun update(index: Int, delta: Int) {
        var i = index + 1
        while (i < tree.size) {
            tree[i] += delta
            i += i and (-i)
        }
    }

    fun prefixSum(count: Int): Int {
        var i = count
        var sum = 0
        while (i > 0) {
            sum += tree[i]
            i -= i and (-i)
        }
        return sum
    }
}

fun main() {
    val data = intArrayOf(1, 2, 3, 4, 5)
    val bit = Fenwick(data.size)
    for (i in data.indices) bit.update(i, data[i])
    println(bit.prefixSum(4))
}
