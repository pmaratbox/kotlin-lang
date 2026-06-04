import java.util.concurrent.Executors

fun main() {
    val pool = Executors.newFixedThreadPool(2)
    val f1 = pool.submit<Int> { 3 * 3 }
    val f2 = pool.submit<Int> { 4 * 4 }
    println(f1.get() + f2.get())
    pool.shutdown()
}
