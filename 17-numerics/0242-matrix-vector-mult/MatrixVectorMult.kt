fun main() {
    val m = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val v = intArrayOf(5, 6)
    val result = m.map { row -> row.zip(v.toList()).sumOf { (a, b) -> a * b } }
    println(result.joinToString(" "))
}
