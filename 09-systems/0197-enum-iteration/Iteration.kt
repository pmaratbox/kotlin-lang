enum class Color { RED, GREEN, BLUE }

fun main() {
    println(Color.entries.joinToString(" ") { it.name })
}
