fun decode(bits: Int): String {
    val r = if (bits and 0b100 != 0) "r" else "-"
    val w = if (bits and 0b010 != 0) "w" else "-"
    val x = if (bits and 0b001 != 0) "x" else "-"
    return "$r$w$x"
}

fun main() {
    println(decode(0b101))
}
