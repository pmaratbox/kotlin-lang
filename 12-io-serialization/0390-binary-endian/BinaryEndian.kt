fun main() {
    val n = 258
    val high = (n shr 8) and 0xFF
    val low = n and 0xFF
    val decoded = high * 256 + low
    println("$high $low $decoded")
}
