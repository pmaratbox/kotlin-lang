import java.util.concurrent.CompletableFuture

fun main() {
    val input = listOf(1, 2, 3, 4)
    val futures = input.map { n -> CompletableFuture.supplyAsync { n * n } }
    val results = futures.map { it.get() }
    println(results.joinToString(" "))
}
