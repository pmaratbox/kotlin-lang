fun main() {
    val rows = listOf("alice,30", "bob,25")
    val pairs = rows.map { row ->
        val (name, value) = row.split(",")
        "$name=$value"
    }
    println(pairs.joinToString(" "))
}
