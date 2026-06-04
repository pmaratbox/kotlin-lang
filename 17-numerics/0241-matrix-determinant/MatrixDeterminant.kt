fun main() {
    val m = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val det = m[0][0] * m[1][1] - m[0][1] * m[1][0]
    println(det)
}
