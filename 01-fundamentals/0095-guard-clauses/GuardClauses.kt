fun classify(n: Int): String {
    if (n < 0) return "negative"
    if (n == 0) return "zero"
    return "positive"
}

fun main() {
    for (n in listOf(-1, 0, 5)) {
        println(classify(n))
    }
}
