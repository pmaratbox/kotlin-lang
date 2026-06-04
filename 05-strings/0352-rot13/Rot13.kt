fun rot13(s: String): String = buildString {
    for (ch in s) {
        append(
            when {
                ch in 'a'..'z' -> 'a' + (ch - 'a' + 13) % 26
                ch in 'A'..'Z' -> 'A' + (ch - 'A' + 13) % 26
                else -> ch
            }
        )
    }
}

fun main() {
    val encoded = rot13("hello")
    val decoded = rot13(encoded)
    println("$encoded $decoded")
}
