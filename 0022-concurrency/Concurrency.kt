import kotlin.concurrent.thread

fun main() {
    val results = IntArray(2)
    val t1 = thread { results[0] = 1 }
    val t2 = thread { results[1] = 2 }
    t1.join()
    t2.join()
    println("sum: ${results[0] + results[1]}")
}
