fun main() {
    val text = "a b\nc"
    val words = text.split(Regex("\\s+")).filter { it.isNotEmpty() }.size
    val lines = text.count { it == '\n' } + 1
    val chars = text.length
    println("$words $lines $chars")
}
