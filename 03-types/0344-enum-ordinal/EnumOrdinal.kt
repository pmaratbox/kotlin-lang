enum class Direction { N, E, S, W }

fun main() {
    val ord = Direction.S.ordinal
    val name = Direction.entries[3].name
    println("$ord $name")
}
