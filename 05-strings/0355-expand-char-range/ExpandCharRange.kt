fun expandRange(spec: String): String {
    val (start, end) = spec.split("-")
    return buildString {
        for (c in start[0]..end[0]) append(c)
    }
}

fun main() {
    println(expandRange("a-e"))
}
