fun isPerfect(n: Int): Boolean = (1 until n).filter { n % it == 0 }.sum() == n

fun main() {
    val a = if (isPerfect(6)) "yes" else "no"
    val b = if (isPerfect(8)) "yes" else "no"
    println("$a $b")
}
