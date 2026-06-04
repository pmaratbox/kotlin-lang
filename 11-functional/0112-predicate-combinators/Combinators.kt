fun <T> and(p: (T) -> Boolean, q: (T) -> Boolean): (T) -> Boolean = { x -> p(x) && q(x) }

fun main() {
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    val isPositive: (Int) -> Boolean = { it > 0 }
    val both = and(isEven, isPositive)
    println("${if (both(4)) "yes" else "no"} ${if (both(-4)) "yes" else "no"}")
}
