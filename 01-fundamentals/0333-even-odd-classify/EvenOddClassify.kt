fun main() {
    val labels = listOf(1, 2, 3, 4).map { if (it % 2 == 0) "even" else "odd" }
    println(labels.joinToString(" "))
}
