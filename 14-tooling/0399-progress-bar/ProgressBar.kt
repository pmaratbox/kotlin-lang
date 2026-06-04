import kotlin.math.roundToInt

fun main() {
    val width = 10
    val filled = (width * 0.4).roundToInt()
    val bar = "#".repeat(filled) + "-".repeat(width - filled)
    println("[$bar]")
}
