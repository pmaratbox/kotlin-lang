fun main() {
    val naturals = generateSequence(1) { it + 1 }
    println(naturals.take(5).joinToString(" "))
}
