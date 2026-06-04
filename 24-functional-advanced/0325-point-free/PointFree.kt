infix fun <A, B, C> ((B) -> C).compose(g: (A) -> B): (A) -> C = { a -> this(g(a)) }

fun main() {
    val square: (List<Int>) -> List<Int> = { xs -> xs.map { it * it } }
    val sum: (List<Int>) -> Int = { it.sum() }
    val sumOfSquares = sum compose square
    println(sumOfSquares(listOf(1, 2, 3)))
}
