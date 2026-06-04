fun minMax(xs: List<Int>): Pair<Int, Int> {
    var min = xs[0]
    var max = xs[0]
    for (x in xs) {
        if (x < min) min = x
        if (x > max) max = x
    }
    return min to max
}

fun main() {
    val (min, max) = minMax(listOf(4, 1, 7))
    println("$min $max")
}
