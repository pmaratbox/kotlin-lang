fun main() {
    val xs = listOf(1, 1, 2, 3, 3, 3)
    val runs = mutableListOf<MutableList<Int>>()
    for (x in xs) {
        if (runs.isEmpty() || runs.last().last() != x) {
            runs.add(mutableListOf(x))
        } else {
            runs.last().add(x)
        }
    }
    println(runs.joinToString("|") { run -> run.joinToString(" ") })
}
