fun main() {
    val bytes = "Hi".toByteArray(Charsets.UTF_8)
    println(bytes.joinToString(" ") { (it.toInt() and 0xFF).toString() })
}
