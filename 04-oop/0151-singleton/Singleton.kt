object Config

fun main() {
    val a = Config
    val b = Config
    println("same: " + if (a === b) "yes" else "no")
}
