interface Color {
    fun name(): String
}

class Red : Color {
    override fun name() = "red"
}

abstract class Shape(protected val color: Color) {
    abstract fun describe(): String
}

class Circle(color: Color) : Shape(color) {
    override fun describe() = "${color.name()} circle"
}

fun main() {
    val shape: Shape = Circle(Red())
    println(shape.describe())
}
