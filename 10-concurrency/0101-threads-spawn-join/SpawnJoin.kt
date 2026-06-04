import kotlin.concurrent.thread

fun main() {
    val workers = (1..3).map { thread { Thread.sleep(1) } }
    workers.forEach { it.join() }
    println("done: ${workers.size}")
}
