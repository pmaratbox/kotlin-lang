fun match(pattern: String, text: String): Boolean {
    var p = 0
    var t = 0
    var star = -1
    var mark = 0
    while (t < text.length) {
        if (p < pattern.length && (pattern[p] == text[t])) {
            p++; t++
        } else if (p < pattern.length && pattern[p] == '*') {
            star = p; mark = t; p++
        } else if (star != -1) {
            p = star + 1; mark++; t = mark
        } else {
            return false
        }
    }
    while (p < pattern.length && pattern[p] == '*') p++
    return p == pattern.length
}

fun main() {
    val results = listOf("aaab", "aac").map { if (match("a*b", it)) "yes" else "no" }
    println(results.joinToString(" "))
}
