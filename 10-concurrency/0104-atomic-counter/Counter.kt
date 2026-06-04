import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

fun main() {
    val counter = AtomicInteger(0)
    val threads = (1..10).map {
        thread {
            repeat(100) { counter.incrementAndGet() }
        }
    }
    threads.forEach { it.join() }
    println(counter.get())
}
