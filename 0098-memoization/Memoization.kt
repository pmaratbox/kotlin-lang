val cache = HashMap<Int, Int>()

fun fib(n: Int): Int {
    if (n < 2) return n
    cache[n]?.let { return it }
    val result = fib(n - 1) + fib(n - 2)
    cache[n] = result
    return result
}

fun main() {
    println(fib(10))
}
