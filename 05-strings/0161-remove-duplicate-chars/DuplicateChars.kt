fun main() {
    val text = "aabbcc"
    val seen = mutableSetOf<Char>()
    val result = buildString {
        for (c in text) {
            if (seen.add(c)) append(c)
        }
    }
    println(result)
}
