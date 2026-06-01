import java.io.Closeable

class Resource : Closeable {
    init {
        println("open")
    }

    override fun close() {
        println("close")
    }
}

fun main() {
    Resource().use {
        println("use")
    }
}
