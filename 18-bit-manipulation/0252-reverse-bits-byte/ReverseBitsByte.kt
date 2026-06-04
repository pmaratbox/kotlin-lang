fun reverseByte(value: Int): Int {
    var result = 0
    for (i in 0 until 8) {
        result = result or (((value shr i) and 1) shl (7 - i))
    }
    return result
}

fun main() {
    println(reverseByte(1))
}
