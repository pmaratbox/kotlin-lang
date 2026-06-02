data class Point(val x: Int, val y: Int)

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(1, 2)
    println("point: (${p1.x}, ${p1.y})")
    println("equal: ${if (p1 == p2) "yes" else "no"}")
}
