fun main() {
    val r = 1
    val g = 2
    val b = 3
    val packed = (r shl 16) or (g shl 8) or b
    val ur = (packed shr 16) and 0xff
    val ug = (packed shr 8) and 0xff
    val ub = packed and 0xff
    println("$ur $ug $ub")
}
