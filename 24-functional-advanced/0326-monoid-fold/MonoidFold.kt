fun <T> foldMonoid(items: List<T>, identity: T, combine: (T, T) -> T): T =
    items.fold(identity, combine)

fun main() {
    val s = foldMonoid(listOf("a", "b", "c"), "") { acc, x -> acc + x }
    val n = foldMonoid(listOf(1, 2, 3), 0) { acc, x -> acc + x }
    println("$s $n")
}
