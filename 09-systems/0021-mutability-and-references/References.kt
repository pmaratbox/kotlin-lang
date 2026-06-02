fun inc(box: IntArray) {
    box[0]++
}

fun main() {
    val box = intArrayOf(1)
    println("before: ${box[0]}")
    inc(box)
    println("after: ${box[0]}")
}
