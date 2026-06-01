abstract class Shape {
    abstract fun area(): Int
    fun describe(): String = "area: ${area()}"
}

class Square(val side: Int) : Shape() {
    override fun area(): Int = side * side
}

fun main() {
    println(Square(3).describe())
}
