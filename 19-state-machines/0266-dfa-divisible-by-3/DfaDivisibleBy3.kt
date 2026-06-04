fun divisibleBy3(bits: String): Boolean {
    var state = 0
    for (c in bits) {
        state = (state * 2 + (c - '0')) % 3
    }
    return state == 0
}

fun main() {
    val results = listOf("110", "100").map { if (divisibleBy3(it)) "yes" else "no" }
    println(results.joinToString(" "))
}
