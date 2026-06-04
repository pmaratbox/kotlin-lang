import java.util.concurrent.CyclicBarrier
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

fun main() {
    val arrived = AtomicInteger(0)
    val barrier = CyclicBarrier(3)
    val threads = (1..3).map {
        thread {
            arrived.incrementAndGet()
            barrier.await()
        }
    }
    threads.forEach { it.join() }
    println("all reached: ${arrived.get()}")
}
