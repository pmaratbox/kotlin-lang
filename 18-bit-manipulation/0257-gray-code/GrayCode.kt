fun main() {
    val codes = (0..3).map { it xor (it shr 1) }
    println(codes.joinToString(" "))
}
