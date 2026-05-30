interface Shape {
    fun name(): String
    fun area(): Int
}

class Rectangle(val width: Int, val height: Int) : Shape {
    override fun name() = "rectangle"
    override fun area() = width * height
}

class Square(val side: Int) : Shape {
    override fun name() = "square"
    override fun area() = side * side
}

fun main() {
    val shapes: List<Shape> = listOf(Rectangle(3, 4), Square(5))
    for (s in shapes) {
        println("${s.name()} area: ${s.area()}")
    }
}
