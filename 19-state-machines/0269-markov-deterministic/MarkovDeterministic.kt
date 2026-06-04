fun main() {
    val next = mapOf("A" to "B", "B" to "C", "C" to "A")
    var state = "A"
    val visited = mutableListOf<String>()
    repeat(3) {
        state = next.getValue(state)
        visited.add(state)
    }
    println(visited.joinToString(" "))
}
