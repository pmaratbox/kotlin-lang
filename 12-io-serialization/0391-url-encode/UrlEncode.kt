fun percentEncode(s: String): String = buildString {
    for (c in s) {
        if (c.isLetterOrDigit() || c in "-_.~") {
            append(c)
        } else {
            append("%%%02X".format(c.code))
        }
    }
}

fun main() {
    println(percentEncode("a b&c"))
}
