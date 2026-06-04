enum class Level { INFO, WARN, ERROR }

fun main() {
    val threshold = Level.WARN
    val messages = listOf(Level.INFO to "i", Level.WARN to "w", Level.ERROR to "e")
    for ((level, msg) in messages) {
        if (level >= threshold) {
            println("${level.name}: $msg")
        }
    }
}
