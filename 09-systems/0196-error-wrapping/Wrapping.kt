fun main() {
    val inner = RuntimeException("inner")
    val outer = RuntimeException("outer", inner)
    println("${outer.message}: ${outer.cause?.message}")
}
