fun attempt(n: Int): Boolean = n >= 3

fun main() {
    val maxAttempts = 5
    for (n in 1..maxAttempts) {
        if (attempt(n)) {
            println("ok after $n")
            break
        }
    }
}
