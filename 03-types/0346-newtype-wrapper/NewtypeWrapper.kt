@JvmInline
value class UserId(val raw: Int) {
    override fun toString() = "user-$raw"
}

@JvmInline
value class ProductId(val raw: Int) {
    override fun toString() = "prod-$raw"
}

fun main() {
    val u = UserId(1)
    val p = ProductId(2)
    println("$u $p")
}
