fun main() {
    val pattern = "ab"
    val text = "aab"
    var state = 0
    var matchIndex = -1
    for (i in text.indices) {
        state = if (text[i] == pattern[state]) state + 1
                else if (text[i] == pattern[0]) 1
                else 0
        if (state == pattern.length) {
            matchIndex = i - pattern.length + 1
            break
        }
    }
    println(matchIndex)
}
