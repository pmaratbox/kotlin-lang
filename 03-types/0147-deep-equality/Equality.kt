fun main() {
    val a = Pair(Pair(1, 2), Pair(3, 4))
    val b = Pair(Pair(1, 2), Pair(3, 4))
    val equal = if (a == b) "yes" else "no"
    println("equal: $equal")
}
