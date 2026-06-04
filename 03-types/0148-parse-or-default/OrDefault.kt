fun main() {
    val ok = "42".toIntOrNull() ?: 0
    val bad = "x".toIntOrNull() ?: 0
    println("$ok $bad")
}
