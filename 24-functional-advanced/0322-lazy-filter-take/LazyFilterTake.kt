fun main() {
    val naturals = generateSequence(1) { it + 1 }
    val evens = naturals.filter { it % 2 == 0 }.take(3)
    println(evens.joinToString(" "))
}
