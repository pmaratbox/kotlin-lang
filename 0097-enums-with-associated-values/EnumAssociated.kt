sealed class Shape
data class Rect(val w: Int, val h: Int) : Shape()
data class Square(val s: Int) : Shape()

fun area(shape: Shape): Int = when (shape) {
    is Rect -> shape.w * shape.h
    is Square -> shape.s * shape.s
}

fun main() {
    for (shape in listOf(Rect(2, 3), Square(4))) {
        println(area(shape))
    }
}
