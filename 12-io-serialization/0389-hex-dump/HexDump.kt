fun main() {
    val hex = "Hi".toByteArray(Charsets.US_ASCII)
        .joinToString(" ") { "%02x".format(it) }
    println(hex)
}
