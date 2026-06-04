import java.util.concurrent.Executors

fun main() {
    val pool = Executors.newFixedThreadPool(2)
    val futures = (1..4).map { n -> pool.submit<Int> { n * n } }
    val results = futures.map { it.get() }.sorted()
    pool.shutdown()
    println(results.joinToString(" "))
}
