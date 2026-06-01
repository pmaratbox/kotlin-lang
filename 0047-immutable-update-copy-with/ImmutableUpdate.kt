data class Point(val x: Int, val y: Int)

fun main() {
    val p1 = Point(1, 2)
    val p2 = p1.copy(x = 9)
    println("original: (${p1.x}, ${p1.y})")
    println("updated: (${p2.x}, ${p2.y})")
}
