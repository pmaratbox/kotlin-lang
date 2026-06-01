fun main() {
    val result = "a,b,c".split(",").joinToString("-") { it.uppercase() }
    println(result)
}
