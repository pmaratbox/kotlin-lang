fun main() {
    val nested = listOf(listOf(1, 2), listOf(3, 4))
    val flat = nested.flatten()
    println(flat.joinToString(" "))
}
