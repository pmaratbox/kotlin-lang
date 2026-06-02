fun main() {
    val text = "aaabbc"
    val result = StringBuilder()
    var i = 0
    while (i < text.length) {
        val ch = text[i]
        var count = 0
        while (i < text.length && text[i] == ch) {
            count++
            i++
        }
        result.append(ch).append(count)
    }
    println(result)
}
