interface Shape {
    fun area(): Int
}

class Rectangle(val width: Int, val height: Int) : Shape {
    override fun area() = width * height
}

class Triangle(val base: Int, val height: Int) : Shape {
    override fun area() = base * height / 2
}

fun main() {
    val shapes = listOf(Rectangle(2, 3), Triangle(4, 4))
    val total = shapes.sumOf { it.area() }
    println("total area: $total")
}
