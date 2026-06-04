interface Logger {
    fun log(message: String)
}

object NullLogger : Logger {
    override fun log(message: String) {}
}

class RealLogger : Logger {
    var count = 0
        private set

    override fun log(message: String) {
        count++
    }
}

fun main() {
    val real = RealLogger()
    NullLogger.log("ignored")
    real.log("recorded")
    println(real.count)
}
