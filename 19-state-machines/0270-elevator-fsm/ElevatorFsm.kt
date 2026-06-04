fun main() {
    val visited = mutableListOf(0)
    var floor = 0
    for (target in listOf(2, 0)) {
        val step = if (target > floor) 1 else -1
        while (floor != target) {
            floor += step
            visited.add(floor)
        }
    }
    println(visited.joinToString(" "))
}
