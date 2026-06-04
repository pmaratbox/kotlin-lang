fun sign(x: Int): Int = when {
    x < 0 -> -1
    x > 0 -> 1
    else -> 0
}

fun main() {
    println("${sign(-5)} ${sign(0)} ${sign(5)}")
}
