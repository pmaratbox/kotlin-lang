fun main() {
    var n = 6
    var steps = 0
    while (n != 1) {
        n = if (n % 2 == 0) n / 2 else 3 * n + 1
        steps++
    }
    println(steps)
}
