import kotlin.concurrent.thread

fun main() {
    val lock = Any()
    var counter = 0
    val threads = (1..10).map {
        thread {
            repeat(100) {
                synchronized(lock) { counter++ }
            }
        }
    }
    threads.forEach { it.join() }
    println(counter)
}
