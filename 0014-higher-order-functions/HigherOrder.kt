fun apply(f: (Int) -> Int, x: Int): Int {
    return f(x)
}

fun main() {
    val inc = { x: Int -> x + 1 }
    val double = { x: Int -> x * 2 }

    println("inc 5 = ${apply(inc, 5)}")
    println("double 5 = ${apply(double, 5)}")
}
