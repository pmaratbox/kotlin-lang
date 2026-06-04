fun main() {
    val terms = generateSequence(1) { it * 2 }.take(5).toList()
    println(terms.joinToString(" "))
}
