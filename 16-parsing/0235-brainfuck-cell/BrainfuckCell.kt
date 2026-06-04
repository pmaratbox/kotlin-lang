fun main() {
    var cell = 0
    for (c in "+++") {
        when (c) {
            '+' -> cell++
            '-' -> cell--
        }
    }
    println(cell)
}
