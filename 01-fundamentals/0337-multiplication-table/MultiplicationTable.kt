fun main() {
    for (i in 1..3) {
        println((1..3).joinToString(" ") { j -> (i * j).toString() })
    }
}
