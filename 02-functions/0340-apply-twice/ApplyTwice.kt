fun applyTwice(f: (Int) -> Int, x: Int): Int = f(f(x))

fun main() {
    val inc = { n: Int -> n + 1 }
    println(applyTwice(inc, 3))
}
