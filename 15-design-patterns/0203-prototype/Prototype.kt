data class Cell(var value: Int)

fun main() {
    val original = Cell(1)
    val clone = original.copy()
    clone.value = 2
    println("${original.value} ${clone.value}")
}
