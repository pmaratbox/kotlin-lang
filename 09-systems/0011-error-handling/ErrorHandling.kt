fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("division by zero")
    }
    return a / b
}

fun main() {
    println("10 / 2 = ${divide(10, 2)}")

    try {
        divide(10, 0)
    } catch (e: ArithmeticException) {
        println("error: ${e.message}")
    }
}
