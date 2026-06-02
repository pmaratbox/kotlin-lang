fun greet(name: String, greeting: String = "Hello"): String {
    return "$greeting, $name"
}

fun main() {
    println(greet("Ada"))
    println(greet("Ada", greeting = "Hi"))
}
