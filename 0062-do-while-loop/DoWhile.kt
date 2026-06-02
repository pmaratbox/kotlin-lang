fun main() {
    val parts = mutableListOf<String>()
    var i = 1
    do {
        parts.add(i.toString())
        i++
    } while (i <= 3)
    println(parts.joinToString(" "))
}
