data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val p = Point(1, 2) + Point(3, 4)
    println("(${p.x}, ${p.y})")
}
