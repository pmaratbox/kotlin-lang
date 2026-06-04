class Point(val x: Int, val y: Int) {
    override fun toString() = "Point($x, $y)"
}

fun main() {
    println(Point(1, 2))
}
