fun main() {
    val a = setOf(1, 2, 3)
    val b = setOf(2, 3, 4)
    println((a union b).sorted().joinToString(" "))
    println((a intersect b).sorted().joinToString(" "))
}
