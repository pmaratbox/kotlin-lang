class Handler(private val level: Int, private val next: Handler? = null) {
    fun handle(request: Int) {
        if (request == level) {
            println("handled by $level")
        } else {
            next?.handle(request)
        }
    }
}

fun main() {
    val chain = Handler(1, Handler(2, Handler(3)))
    chain.handle(2)
}
