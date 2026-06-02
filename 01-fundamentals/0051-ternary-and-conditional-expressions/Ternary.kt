fun main() {
    for (n in listOf(4, 7)) {
        val label = if (n % 2 == 0) "even" else "odd"
        println("$n: $label")
    }
}
