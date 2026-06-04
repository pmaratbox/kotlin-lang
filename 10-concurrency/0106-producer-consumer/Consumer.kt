import java.util.concurrent.ArrayBlockingQueue
import kotlin.concurrent.thread

private const val POISON = -1

fun main() {
    val queue = ArrayBlockingQueue<Int>(2)
    val producer = thread {
        for (i in 1..5) queue.put(i)
        queue.put(POISON)
    }
    var sum = 0
    val consumer = thread {
        while (true) {
            val v = queue.take()
            if (v == POISON) break
            sum += v
        }
    }
    producer.join()
    consumer.join()
    println(sum)
}
