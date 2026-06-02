fun main() {
    val text = "abc"
    val shift = 1
    val result = text.map { ch -> 'a' + (ch - 'a' + shift) % 26 }.joinToString("")
    println(result)
}
