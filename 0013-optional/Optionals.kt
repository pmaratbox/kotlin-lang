fun main() {
    val present: Int? = 42
    val absent: Int? = null

    println("present: ${present ?: -1}")
    println("absent: ${absent ?: -1}")
}
