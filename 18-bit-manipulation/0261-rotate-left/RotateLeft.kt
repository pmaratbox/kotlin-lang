fun rol8(x: Int, n: Int): Int = ((x shl n) or (x shr (8 - n))) and 0xff

fun main() {
    println("${rol8(1, 1)} ${rol8(128, 1)}")
}
