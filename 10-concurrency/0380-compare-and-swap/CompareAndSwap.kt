import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

fun main() {
    val value = AtomicInteger(0)
    val threads = (1..4).map {
        thread {
            repeat(25) {
                while (true) {
                    val current = value.get()
                    if (value.compareAndSet(current, current + 1)) break
                }
            }
        }
    }
    threads.forEach { it.join() }
    println(value.get())
}
