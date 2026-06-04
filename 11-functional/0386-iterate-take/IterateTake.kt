fun main() {
    val values = generateSequence(1) { it * 3 }.take(4).toList()
    println(values.joinToString(" "))
}
