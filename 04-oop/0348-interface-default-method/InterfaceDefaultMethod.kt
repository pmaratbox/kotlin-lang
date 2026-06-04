interface Greeter {
    fun greet(): String = "hi"
}

class Friendly : Greeter {
    override fun greet() = "hey"
}

fun main() {
    val plain = object : Greeter {}
    val friendly = Friendly()
    println("${plain.greet()} ${friendly.greet()}")
}
