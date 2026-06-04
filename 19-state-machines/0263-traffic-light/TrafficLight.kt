fun main() {
    val next = mapOf("red" to "green", "green" to "yellow", "yellow" to "red")
    var state = "red"
    val visited = mutableListOf<String>()
    repeat(4) {
        state = next.getValue(state)
        visited.add(state)
    }
    println(visited.joinToString(" "))
}
