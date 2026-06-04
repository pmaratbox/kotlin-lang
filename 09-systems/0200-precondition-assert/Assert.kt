fun check(arg: Int) {
    require(arg > 0) { "must be positive" }
    println("ok")
}

fun main() {
    for (arg in listOf(5, -1)) {
        try {
            check(arg)
        } catch (e: IllegalArgumentException) {
            println("error: ${e.message}")
        }
    }
}
