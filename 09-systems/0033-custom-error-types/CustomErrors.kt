class TooLargeException(message: String) : Exception(message)

fun check(n: Int) {
    if (n > 100) {
        throw TooLargeException("value too large")
    }
}

fun main() {
    try {
        check(200)
    } catch (e: TooLargeException) {
        println("error: ${e.message}")
    }
}
