fun word(n: Int): String = when (n) {
    1 -> "one"
    2 -> "two"
    else -> "many"
}

fun main() {
    for (n in listOf(1, 2, 5)) {
        println("$n: ${word(n)}")
    }
}
