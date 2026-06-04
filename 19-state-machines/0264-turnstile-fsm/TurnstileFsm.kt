fun main() {
    val table = mapOf(
        ("locked" to "coin") to "unlocked",
        ("unlocked" to "push") to "locked",
        ("locked" to "push") to "locked",
    )
    var state = "locked"
    val events = listOf("coin", "push", "push")
    val visited = events.map { event ->
        state = table.getValue(state to event)
        state
    }
    println(visited.joinToString(" "))
}
