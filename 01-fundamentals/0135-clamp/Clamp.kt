fun clamp(x: Int, lo: Int, hi: Int): Int = maxOf(lo, minOf(x, hi))

fun main() {
    println("${clamp(15, 0, 10)} ${clamp(-3, 0, 10)}")
}
