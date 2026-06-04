fun main() {
    val json = "[1,2,3]"
    val sum = json.trim().removeSurrounding("[", "]")
        .split(",")
        .sumOf { it.trim().toInt() }
    println(sum)
}
