fun main() {
    val present: Int? = 10
    val absent: Int? = null
    val a = present?.let { it + 2 }?.toString() ?: "none"
    val b = absent?.let { it + 2 }?.toString() ?: "none"
    println("$a $b")
}
