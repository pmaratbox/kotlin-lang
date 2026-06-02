fun main() {
    val a = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val b = arrayOf(intArrayOf(5, 6), intArrayOf(7, 8))
    val n = 2
    val result = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            for (k in 0 until n) {
                result[i][j] += a[i][k] * b[k][j]
            }
        }
    }

    for (row in result) {
        println(row.joinToString(" "))
    }
}
