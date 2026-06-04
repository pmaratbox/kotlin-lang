interface Shape {
    val kind: String
}

class Circle : Shape {
    override val kind = "circle"
}

class Square : Shape {
    override val kind = "square"
}

fun makeShape(name: String): Shape = when (name) {
    "circle" -> Circle()
    "square" -> Square()
    else -> throw IllegalArgumentException(name)
}

fun main() {
    val a = makeShape("circle")
    val b = makeShape("square")
    println("${a.kind} ${b.kind}")
}
