fun main() {
    val src = "1 + 2"
    val tokens = mutableListOf<String>()
    for (c in src) {
        when {
            c.isDigit() -> tokens.add("NUM")
            c == '+' -> tokens.add("PLUS")
        }
    }
    println(tokens.joinToString(" "))
}
