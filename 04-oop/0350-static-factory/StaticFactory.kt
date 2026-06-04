class Color private constructor(val r: Int, val g: Int, val b: Int) {
    companion object {
        fun fromHex(hex: String): Color {
            val s = hex.removePrefix("#")
            val r = s.substring(0, 2).toInt(16)
            val g = s.substring(2, 4).toInt(16)
            val b = s.substring(4, 6).toInt(16)
            return Color(r, g, b)
        }
    }
}

fun main() {
    val c = Color.fromHex("#ff0000")
    println("${c.r} ${c.g} ${c.b}")
}
