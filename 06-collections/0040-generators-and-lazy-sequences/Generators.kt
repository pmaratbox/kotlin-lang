fun main() {
    val squares = sequence {
        var n = 1
        while (true) {
            yield(n * n)
            n++
        }
    }
    println(squares.take(3).joinToString(" "))
}
