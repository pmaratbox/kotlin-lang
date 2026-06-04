data class Point(val x: Int = 0, val y: Int = 0)

fun main() {
    val a = Point()
    val b = Point(x = 5)
    println("${a.x} ${a.y}")
    println("${b.x} ${b.y}")
}
