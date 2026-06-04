fun main() {
    val a = listOf(2, 2, 1, 2, 3, 2)
    var candidate = 0
    var count = 0
    for (x in a) {
        if (count == 0) candidate = x
        count += if (x == candidate) 1 else -1
    }
    println(candidate)
}
