import java.util.concurrent.LinkedBlockingQueue
import kotlin.concurrent.thread

fun main() {
    val queue = LinkedBlockingQueue<Int>()
    val producer = thread {
        for (i in 1..3) queue.put(i)
    }
    producer.join()
    val received = (1..3).map { queue.take() }
    println(received.joinToString(" "))
}
