import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

private val initCount = AtomicInteger(0)

private val config: String by lazy {
    initCount.incrementAndGet()
    "ready"
}

fun main() {
    val threads = (1..10).map { thread { config } }
    threads.forEach { it.join() }
    println("init count: ${initCount.get()}")
}
