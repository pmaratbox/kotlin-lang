fun longestCommonPrefix(strs: List<String>): String {
    if (strs.isEmpty()) return ""
    val first = strs[0]
    for (i in first.indices) {
        val c = first[i]
        for (s in strs) {
            if (i >= s.length || s[i] != c) return first.substring(0, i)
        }
    }
    return first
}

fun main() {
    println(longestCommonPrefix(listOf("flower", "flow", "flight")))
}
