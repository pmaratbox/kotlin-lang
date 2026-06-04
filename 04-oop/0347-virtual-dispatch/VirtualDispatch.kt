abstract class Shape {
    abstract fun describe(): String
}

class Circle : Shape() {
    override fun describe() = "circle"
}

class Square : Shape() {
    override fun describe() = "square"
}

class Triangle : Shape() {
    override fun describe() = "triangle"
}

fun main() {
    val shapes: List<Shape> = listOf(Circle(), Square(), Triangle())
    println(shapes.joinToString(" ") { it.describe() })
}
