fun main() {
    val text = "ababab"
    val needle = "ab"
    var count = 0
    var i = 0
    while (i <= text.length - needle.length) {
        if (text.startsWith(needle, i)) {
            count++
            i += needle.length
        } else {
            i++
        }
    }
    println(count)
}
